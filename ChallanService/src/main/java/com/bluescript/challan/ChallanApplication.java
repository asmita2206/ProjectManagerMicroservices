package com.bluescript.challan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ChallanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallanApplication.class, args);
	}

}
