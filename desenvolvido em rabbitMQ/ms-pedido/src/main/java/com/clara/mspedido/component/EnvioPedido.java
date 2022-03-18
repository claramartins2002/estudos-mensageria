package com.clara.mspedido.component;

import com.clara.mspedido.model.Pedido;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnvioPedido {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(String pedido) {
        rabbitTemplate.convertAndSend(this.queue.getName(), pedido);
    }
}
