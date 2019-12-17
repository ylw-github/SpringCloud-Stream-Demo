package com.ylw.springcloud.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(SendMessageInterface.class) // 开启绑定
public class AppProducer {

    public static void main(String[] args) {
        SpringApplication.run(AppProducer.class, args);
    }

}
