package com.clara.mspedido;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableRabbit
@SpringBootApplication
public class MsPedidoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPedidoApplication.class, args);
	}

}
