package com.clara.mspedido.resource;

import com.clara.mspedido.model.Pedido;
import com.clara.mspedido.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {
    @Autowired
    PedidoService service;

    @PostMapping
    public ResponseEntity<String> novoPedido(@RequestBody Pedido pedido) {
        service.novoPedido(pedido);
        return ResponseEntity.ok("Pedido realizado com sucesso! "+pedido);
    }
}
