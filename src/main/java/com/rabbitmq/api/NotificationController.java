package com.rabbitmq.api;

import com.rabbitmq.entities.Notification;
import com.rabbitmq.producer.ProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notification")
public class NotificationController {

    private final ProducerService producerService;

    public NotificationController(ProducerService producerService) {
        this.producerService = producerService;
    }


    @GetMapping
    public String getNotification(@RequestBody Notification notification){

        producerService.senToQueque(notification);
        return "Notification sent";
    }
}
