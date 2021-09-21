package com.bluescript.taxinvoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TaxinvoiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxinvoiceApplication.class, args);
	}

}
