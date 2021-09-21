package com.bluescript.inquirydetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InquirydetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InquirydetailsApplication.class, args);
	}

}
