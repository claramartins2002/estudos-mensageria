package com.clara.mspedido.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido implements Serializable {
    private Integer codigoPedido;
    private String nomeCliente;
    private Double precoPedido;
    private List<String> itensPedido;

    @Override
    public String toString() {
        return
                "Pedido nº " + codigoPedido +
                        ", Cliente: '" + nomeCliente + '\'' +
                        ", Preço: R$" + precoPedido +
                        ", Itens: " + itensPedido
                ;
    }
}
