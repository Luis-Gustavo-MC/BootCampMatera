package com.example.demo;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		BigDecimal saldo = new BigDecimal(0.0);
		BigDecimal valor1 = new BigDecimal(10);
		BigDecimal valor2 = new BigDecimal(15);
		Cliente a1 = Cliente.builder().
			id(UUID.randomUUID()).
			nome("Luis").
			saldo(saldo).
			build();
			a1.adicionarSaldo(valor1);
			//a1.sacarSaldo(valor2);
			System.out.println(a1);
	}

}
