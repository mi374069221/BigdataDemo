package com.qm.test

import java.sql.{Connection, PreparedStatement}
import java.util.Properties

import com.qm.utils.OffsetManager
import com.typesafe.config.ConfigFactory
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.kafka.common.TopicPartition
import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{DataFrame, SaveMode, SparkSession}
import org.apache.spark.streaming.dstream.InputDStream
import org.apache.spark.streaming.kafka010._
import org.apache.spark.streaming.{Seconds, StreamingContext}

/** coder mi
  * Created 2019/11/04
  * 程序入口
  */
case class Person(name: String, value: String)

object StreamingKafka {
  val config = ConfigFactory.load()
  Logger.getLogger("org").setLevel(Level.WARN)

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setMaster("local[*]")
    conf.setAppName("StreamingKafka")
    //每秒钟每个分区kafka拉取消息的速率,批次最大数据量 = 3（分区数） * 10(速率) * 2（批次时间）
    conf.set("spark.streaming.kafka.maxRatePerPartition", "10")
    conf.set("spark.streaming.stopGracefullyOnShutdown", "true") // 程序优雅的关闭
    conf.set("spark.serializer", "org.apache.spark.serializer.KryoSerializer") //使用kafka自带的序列化机制
    conf.set("spark.rdd.compress", "true")
    //rdd压缩
    //conf.set("fetch.message.max.bytes", "52428800")
    //设置批次时间
    val ssc: StreamingContext = new StreamingContext(conf, Seconds(2))

    //封装kafka的相关参数
    val groupId = "group02"
    val kafkaParams: Map[String, Object] = Map[String, Object](
      "bootstrap.servers" -> "node-01:9092,node-02:9092,node-03:9092",
      //"bootstrap.servers" -> "hadoop-02:6667,hadoop-03:6667,hadoop-04:6667",
      "key.deserializer" -> "org.apache.kafka.common.serialization.StringDeserializer", // 类.class.getName也可以
      "value.deserializer" -> "org.apache.kafka.common.serialization.StringDeserializer",
      "group.id" -> groupId,
      "auto.offset.reset" -> "earliest", //从最初开始消费
      //"auto.offset.reset" -> "latest",
      "enable.auto.commit" -> (false: java.lang.Boolean) //自己维护偏移量。连接kafka的集群。
    )

    // 如何告诉程序从我们自己维护的偏移量位置开始拉去数据？
    // 如果程序是第一次启动，则不需要指定偏移量，直接从最早的位置开始消费即可
    // 如果程序非第一启动，则需要指定我们自己维护的偏移量，从指定的位置开始消费数据
    // 如何判断程序是第一次启动？当数据库中没有数据的时候，我们就认为程序是第一次启动
    val offsets: Map[TopicPartition, Long] = OffsetManager(groupId)
    val stream: InputDStream[ConsumerRecord[String, String]] = if (offsets.size == 0) {
      KafkaUtils.createDirectStream[String, String](ssc,
        LocationStrategies.PreferConsistent, // 将拉去到的数据，均匀分散到每台Executor节点上
        ConsumerStrategies.Subscribe[String, String](Array("test02"), kafkaParams)
      )
    } else {
      KafkaUtils.createDirectStream[String, String](ssc,
        LocationStrategies.PreferConsistent, // 将拉去到的数据，均匀分散到每台Executor节点上
        ConsumerStrategies.Subscribe[String, String](Array("test02"), kafkaParams, offsets)
      )
    }

    //=======================计算逻辑始===========================
    /*   val line: DStream[String] = stream.map(data => new String(data.toString))
       val dataRDD: DStream[String] = stream.map(_.value())
       val datas = dataRDD.map(line => {
         val index: Array[String] = line.split(",")
         val name = index(0)
         val value = index(1)
         (name, value)
       })

       datas.foreachRDD(rdd => {

         rdd.foreachPartition(f => {
           val ps: PreparedStatement = conn.prepareStatement("insert into test_table values(?,?)")
           f.foreach(s => {
             ps.setString(1, s._1)
             ps.setString(2, s._2)
             ps.executeUpdate()
           })
           ps.close()
         })

         //=======================计算逻辑终===========================

       })*/


    stream.foreachRDD(rdd => {
      //sqlContext
      val spark: SparkSession = SparkSession.builder().config(rdd.sparkContext.getConf).getOrCreate()

      val dataRDD: RDD[String] = rdd.map(line => {
        line.value()
      })
      val lineArrayRDD: RDD[Array[String]] = dataRDD.map(_.split(","))
      val personRDD: RDD[Person] = lineArrayRDD.map(x => Person(x(0).toString, x(1).toString))
      //导入隐式转换
      import spark.implicits._
      val personDF: DataFrame = personRDD.toDF()
      personDF.show()
      personDF.createOrReplaceTempView("test_table")
      //执行sql
      val result = spark.sql(
        """
          |select * from test_table
        """.stripMargin)


      // 封装用户名和口令
      val props = new Properties()
      props.setProperty("user", config.getString("db.user"))
      props.setProperty("password", config.getString("db.password"))

      // result.count()
      if (!result.rdd.isEmpty()) {
        // 将统计好的该批次结果写入到数据库中
        result.write.mode(SaveMode.Append).jdbc(
          config.getString("db.url"),
          config.getString("db.table"),
          props
        )
      }


      val offsetRanges: Array[OffsetRange] = rdd.asInstanceOf[HasOffsetRanges].offsetRanges
      /*-----------------储存偏移量-------------------*/
      val conn: Connection = OffsetManager.getConn       //获取jdbc连接
      val prepareStatement: PreparedStatement = conn.prepareStatement("replace into kafka_offset_test values(?,?,?,?)")

      for (or <- offsetRanges) {
        println(s"${or.topic}, ${or.partition}, ${or.fromOffset}, ${or.untilOffset}")
        prepareStatement.setString(1, or.topic)
        prepareStatement.setInt(2, or.partition)
        prepareStatement.setLong(3, or.untilOffset)
        prepareStatement.setString(4, groupId)
        //执行
        prepareStatement.execute()
      }
      prepareStatement.close()
      conn.close()
    })

    ssc.start()
    ssc.awaitTermination()

  }
}
