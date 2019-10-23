package com.rahn.rabbitq;

import model.Foo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {
    
  //  @RabbitListener(queues = "${rrr.rabbitmq.queue}")
    public void recievedMessage(Foo employee) {
        System.out.println("Received Message From RabbitMQ: " + employee);
    }
}
