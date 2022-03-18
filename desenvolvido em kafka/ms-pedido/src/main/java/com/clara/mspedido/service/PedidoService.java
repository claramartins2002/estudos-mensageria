package com.clara.mspedido.service;

import com.clara.mspedido.model.Pedido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    private static final Logger logger = LoggerFactory.getLogger(PedidoService.class);
    @Autowired
    private KafkaTemplate<String, Pedido>
            kafkaTemplate;


    public void novoPedido(Pedido pedido){
        logger.info("Novo pedido! -> {}",pedido);
        this.kafkaTemplate.send("pedidos", pedido);
    }
}
