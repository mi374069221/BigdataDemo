package com.qm.app

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
/**
  * coder mi
  * Created 2019/11/04
  * 程序入口
  */

case class Qljk(nodeIp:String,dataTime:String,status:Int,weather:String,windDirection:Int,windSpeed:String,
                temperature:String,waterLevel:String,gravity:String,frequency:String,
                subsidenceDegree:String,displacementDegree:String,tiltDegree:String,
                affectResult:Int)

object BootStrapApp {
  val config = ConfigFactory.load()
  Logger.getLogger("org").setLevel(Level.WARN)

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setMaster("local[*]")
    conf.setAppName("桥梁监控平台")
    //每秒钟每个分区kafka拉取消息的速率,批次最大数据量 = 3（分区数） * 10(速率) * 2（批次时间）
    conf.set("spark.streaming.kafka.maxRatePerPartition", "10")
    conf.set("spark.streaming.stopGracefullyOnShutdown", "true") // 程序优雅的关闭
    conf.set("spark.serializer","org.apache.spark.serializer.KryoSerializer")//使用kafka自带的序列化机制
    conf.set("spark.rdd.compress", "true")//rdd压缩
    //conf.set("fetch.message.max.bytes", "52428800")
    //设置批次时间
    val ssc: StreamingContext = new StreamingContext(conf, Seconds(1))

    //封装kafka的相关参数
    val groupId = "group08"
    val kafkaParams: Map[String, Object] = Map[String, Object](
      //"bootstrap.servers" -> "node-01:9092,node-02:9092,node-03:9092",
      "bootstrap.servers" -> "hadoop-02:6667,hadoop-03:6667,hadoop-04:6667",
      "key.deserializer" -> "org.apache.kafka.common.serialization.StringDeserializer", // 类.class.getName也可以
      "value.deserializer" -> "org.apache.kafka.common.serialization.StringDeserializer",
      "group.id" -> groupId,
      "auto.offset.reset" -> "earliest",//从最初开始消费
      //"auto.offset.reset" -> "latest",
      "enable.auto.commit" -> (false: java.lang.Boolean)  //自己维护偏移量。连接kafka的集群。
    )

    // 如何告诉程序从我们自己维护的偏移量位置开始拉去数据？
    // 如果程序是第一次启动，则不需要指定偏移量，直接从最早的位置开始消费即可
    // 如果程序非第一启动，则需要指定我们自己维护的偏移量，从指定的位置开始消费数据
    // 如何判断程序是第一次启动？当数据库中没有数据的时候，我们就认为程序是第一次启动
    val offsets: Map[TopicPartition, Long] = OffsetManager(groupId)
    val stream: InputDStream[ConsumerRecord[String, String]] = if (offsets.size == 0) {
      KafkaUtils.createDirectStream[String, String](ssc,
        LocationStrategies.PreferConsistent, // 将拉去到的数据，均匀分散到每台Executor节点上
        ConsumerStrategies.Subscribe[String, String](Array("testTopic08"), kafkaParams)
      )
    } else {
      KafkaUtils.createDirectStream[String, String](ssc,
        LocationStrategies.PreferConsistent, // 将拉去到的数据，均匀分散到每台Executor节点上
        ConsumerStrategies.Subscribe[String, String](Array("testTopic08"), kafkaParams, offsets)
      )
    }
    stream.foreachRDD(rdd => {

      //=======================计算逻辑始===========================



      /* val allData: RDD[String] = rdd.flatMap(_.value().split(","))
      allData.foreach(println)
      var prep: PreparedStatement = null
      allData.foreachPartition(datas => {
        prep=conn.prepareStatement("insert into test_table values(?,?)")
        datas.foreach(test => {
          prep.setString(1, test.take(1))
          prep.setString(2, test.take(2))
          prep.executeUpdate()
        })
        prep.close()
      })*/

      /*      //数据存入redis
            val allData: RDD[(String, Int)] = rdd.flatMap(_.value().split(",")).map((_, 1)).reduceByKey(_ + _)
            allData.foreach(println)
            allData.foreachPartition(datas => {
              val jedis = Jpools.getJedis
              datas.foreach(test => {
                jedis.hincrBy("name",test._1,test._2)
              })
              jedis.close()
            })*/



      //rdd.foreach(println)
      //sqlContext
      val spark: SparkSession = SparkSession.builder().config(rdd.sparkContext.getConf).getOrCreate()

      val dataRDD: RDD[String] = rdd.map(line => {
        line.value()
      })
      val lineArrayRDD: RDD[Array[String]] = dataRDD.map(_.split(","))
      val qljkRDD: RDD[Qljk] = lineArrayRDD.map(x =>
        Qljk(x(0).toString,x(1).toString, x(2).toInt,x(3).toString,x(4).toInt,x(5).toString,x(6).toString,
          x(7).toString,x(8).toString,x(9).toString,x(10).toString,x(11).toString,x(12).toString,
          x(13).toInt)
      )
      //导入隐式转换
      import spark.implicits._
      val personDF: DataFrame = qljkRDD.toDF()
      personDF.show()
      personDF.createOrReplaceTempView("all_data")
      //执行sql
      val result = spark.sql(
        """
          |select * from all_data
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
      val prepareStatement: PreparedStatement = conn.prepareStatement("replace into kafka_offset values(?,?,?,?)")

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
