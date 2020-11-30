package com.example.consumer_rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerRabbitmqApplication  {
    @Autowired
    private HelloConsumer consumer;
    public static void main(String[] args) {
        SpringApplication.run(ConsumerRabbitmqApplication.class, args);
    }


}
