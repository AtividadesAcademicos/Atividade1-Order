package com.desafio.desafio1;

import com.desafio.desafio1.entities.Order;
import com.desafio.desafio1.entities.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {


	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);

		Order order =  new Order(1034,150.00,20.0);

		System.out.println("Order code : " + order.getCode());

		System.out.printf("Total value: %.2f%n ", orderService.total(order) );
	}
}