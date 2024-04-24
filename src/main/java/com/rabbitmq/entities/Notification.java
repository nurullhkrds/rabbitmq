package com.rabbitmq.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.io.Serializable;

@Entity(name = "notification")
@Getter
public class Notification implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String notificationType;
    private String message;


    @Override
    public String toString() {
        return "Notification{" +
                "id=" + getId() +
                ", notificationType='" + getNotificationType() + '\'' +
                ", message='" + getMessage() + '\'' +
                '}';
    }


}
