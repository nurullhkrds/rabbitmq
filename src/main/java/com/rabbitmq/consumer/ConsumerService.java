package com.rabbitmq.consumer;

import com.rabbitmq.entities.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {


    @RabbitListener(queues = "rabbitmq-queue")
    public void consumeMessage(Notification notification) {
        System.out.println("Notification received: " + notification.toString());
    }
}
