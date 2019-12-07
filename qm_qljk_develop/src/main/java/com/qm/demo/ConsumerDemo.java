package com.qm.demo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Arrays;
import java.util.Properties;

public class ConsumerDemo {

    public static void main(String[] args) {
// 1、准备配置文件
        Properties props = new Properties();
        props.put("bootstrap.servers", "node-01:9092,node-02:9092,node-03:9092");
        props.put("group.id", "test");
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        props.put("key.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");
// 2、创建 KafkaConsumer
        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<String,
                String>(props);
// 3、订阅数据，这里的 topic 可以是多个
        kafkaConsumer.subscribe(Arrays.asList("test01"));
// 4、获取数据
        while (true) {
            ConsumerRecords<String, String> records = kafkaConsumer.poll(100);
            for (ConsumerRecord<String, String> record : records) {
                System.out.println(record.value());
            }
        }


    }
}