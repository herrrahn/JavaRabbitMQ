package com.rahn.rabbitq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitqApplication {

    public static void main(String[] args) {
        //SpringApplication.run(new Object[] { RabbitqApplication.class }, args);
        SpringApplication.run(RabbitqApplication.class, args);
    }
}
