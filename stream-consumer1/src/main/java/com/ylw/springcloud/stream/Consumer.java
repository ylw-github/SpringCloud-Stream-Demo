package com.ylw.springcloud.stream;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @StreamListener("my_msg")
    public void listener(String msg) {
        System.out.println("消费者1  -> 获取生产消息:" + msg);
    }

}