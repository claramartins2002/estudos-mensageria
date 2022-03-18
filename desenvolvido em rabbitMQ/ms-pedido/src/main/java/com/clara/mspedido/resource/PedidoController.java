package com.clara.mspedido.resource;

import com.clara.mspedido.component.EnvioPedido;
import com.clara.mspedido.model.Pedido;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    EnvioPedido envio;

    @PostMapping
    public ResponseEntity<String> novo(@RequestBody Pedido pedido) {
        Gson gson = new Gson();
        envio.send(gson.toJson(pedido));
        System.out.println("Novo pedido! => "+pedido);
    return ResponseEntity.ok("Pedido enviado com sucesso, " + pedido.getNomeCliente());
    }
}
