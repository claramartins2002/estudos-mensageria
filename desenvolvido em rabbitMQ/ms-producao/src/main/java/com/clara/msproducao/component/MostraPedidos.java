package com.clara.msproducao.component;

import com.clara.msproducao.model.Pedido;
import com.google.gson.Gson;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MostraPedidos {

        @RabbitListener(queues = {"${queue.name}"})
        public void receber(@Payload String pedido) {
            Pedido data = new Gson().fromJson(pedido, Pedido.class);
            System.out.println("Pedido => " + data.getItensPedido());
        }
}
