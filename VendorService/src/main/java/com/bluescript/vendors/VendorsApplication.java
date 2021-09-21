package com.bluescript.vendors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VendorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorsApplication.class, args);
	}

}
