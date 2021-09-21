package com.bluescript.purchaseorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PurchaseorderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseorderApplication.class, args);
	}

}
