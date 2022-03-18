package com.clara.mspedido.tests;

import com.clara.mspedido.model.Pedido;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestePedidos {
    @Test
    public void testeClasse() throws Exception {
        List<String> itens = new ArrayList<>();
        itens.add("Hambúrguer médio cheese bacon");
        itens.add( "Coca lata pequena");
        itens.add( "Pizza doce sabor ninho+nutella");
        Pedido pedido = new Pedido(1, "Clara", 29.99, itens);
    }
}
