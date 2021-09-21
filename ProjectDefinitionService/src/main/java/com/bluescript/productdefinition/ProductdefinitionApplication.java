package com.bluescript.productdefinition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductdefinitionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductdefinitionApplication.class, args);

	}

}
