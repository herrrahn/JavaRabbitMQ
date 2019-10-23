package com.rahn.rabbitq;
import model.Foo;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${rrr.rabbitmq.exchange}")
    private String exchange;

    @Value("${rrr.rabbitmq.routingkey}")
    private String routingkey;

    public void send(Foo company) {
        rabbitTemplate.convertAndSend(exchange, routingkey, company);
        System.out.println("Send msg = " + company);

    }
}
