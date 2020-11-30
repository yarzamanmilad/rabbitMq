package com.example.consumer_rabbitmq.consumer;

import com.example.consumer_rabbitmq.domain.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.PrivateKey;

@Service
public class EmployeeConsumer {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    private ObjectMapper mapper=new ObjectMapper();
    @RabbitListener(queues = "employee-q")

    public void listen(String msg){
        try {
            Employee employee = mapper.readValue(msg, Employee.class);
            logger.info("employee id: "+employee.getId()+"employee name: "+employee.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
