package com.techie.microservices.product;

import org.springframework.boot.SpringApplication;

import com.techie.ProductServiceApplication;

public class TestProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProductServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
