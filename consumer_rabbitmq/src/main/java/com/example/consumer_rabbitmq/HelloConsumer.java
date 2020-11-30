package com.example.consumer_rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class HelloConsumer {
    @RabbitListener(queues = "hello-queue")
    public void listen(String msg){
        System.out.println(msg);
    }
}
