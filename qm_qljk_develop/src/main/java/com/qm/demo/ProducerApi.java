package com.qm.demo;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.UUID;

/**
 * kafka api
 * 生产数据
 */
public class ProducerApi {
    public static void main(String[] args) throws InterruptedException {
        Properties props = new Properties();
        props.setProperty("bootstrap.servers", "node-01:9092,node-02:9092,node-03:9092");
        //props.setProperty("bootstrap.servers", "hadoop-02:6667,hadoop-03:6667,hadoop-04:6667");
        props.setProperty("key.serializer", StringSerializer.class.getName());
        props.setProperty("value.serializer", StringSerializer.class.getName());

        //创建生产者对象实例
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<String, String>(props);

        int i = 1;
        while (i <= 100) {
            int part = i % 3;
            ProducerRecord<String, String> record = new ProducerRecord<String, String>("testTopic02", part, UUID.randomUUID().toString(), "dami"+","+"AA"+ i);
            //发送数据
            kafkaProducer.send(record);
            i++;
            Thread.sleep(1000);
            System.out.println("record=" + record);
        }


        kafkaProducer.close();
        System.out.println("生产结束！");

    }
}
