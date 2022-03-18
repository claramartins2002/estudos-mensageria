package com.clara.msproducao;

import com.clara.msproducao.model.Pedido;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ListarPedidos {
    private final Logger logger = LoggerFactory.getLogger(ListarPedidos.class);

    @KafkaListener(topics = "pedidos", groupId = "group_id")
    public void consumir(String pedido) throws Exception {
        Pedido data = new Gson().fromJson(pedido, Pedido.class);
        logger.info(String.format("#### Pedido %s -> %s", data.getCodigoPedido(), data.getItensPedido()));
    }
}
