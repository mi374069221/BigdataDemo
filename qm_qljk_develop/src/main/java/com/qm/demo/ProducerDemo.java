package com.qm.demo;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class ProducerDemo {

    public static void main(String[] args) {
//1、准备配置文件
        Properties props =  new Properties();
        props.put( "bootstrap.servers",  "node-01:9092,node-02:9092,node-03:9092");
        props.put( "acks",  "all");
        props.put( "retries", 0);
        props.put( "batch.size", 16384);
        props.put( "linger.ms", 1);
        props.put( "buffer.memory", 33554432);
        props.put( "key.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");
        props.put( "value.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");
//2、创建 KafkaProducer
        KafkaProducer<String, String> kafkaProducer =  new KafkaProducer<String, String>(props);
         for (int i=0;i<100;i++){
//3、发送数据
            kafkaProducer.send( new ProducerRecord<String,String>( "test02", "num"+i,  "dami"+","+"AA"+ i));
        }
        System.out.println("数据生产完成");
        kafkaProducer.close();
    }
}
