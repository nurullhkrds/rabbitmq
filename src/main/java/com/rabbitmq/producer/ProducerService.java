package com.rabbitmq.producer;


import com.rabbitmq.entities.Notification;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {


    @Value("${sr.rabbit.routing.name}")
    private String routingName;


    @Value("${sr.rabbit.exchange.name}")
    private String exchangeName;

    private final RabbitTemplate rabbitTemplate;

    public ProducerService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void senToQueque(Notification message) {
        rabbitTemplate.convertAndSend(exchangeName, routingName, message);
    }
}
