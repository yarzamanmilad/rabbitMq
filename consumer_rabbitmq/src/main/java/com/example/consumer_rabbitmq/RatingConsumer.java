package com.example.consumer_rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RatingConsumer {
    Logger logger= LoggerFactory.getLogger(this.getClass());
    @RabbitListener(queues = "fix_rating_queue",concurrency = "3")
    public void Listen(String msg){
        logger.info(msg+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
