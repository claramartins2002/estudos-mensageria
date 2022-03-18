package com.clara.msproducao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private Integer codigoPedido;
    private String nomeCliente;
    private Double precoPedido;
    private List<String> itensPedido;


}
