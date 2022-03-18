package com.clara.msproducao;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableRabbit
@SpringBootApplication
public class MsProducaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProducaoApplication.class, args);
	}

}
