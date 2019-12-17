package com.ylw.springcloud.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(RedMsgInterface.class)
public class AppConsumer {

    public static void main(String[] args) {
        SpringApplication.run(AppConsumer.class, args);
    }

}

