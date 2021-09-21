package com.bluescript.projectdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProjectDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDetailsApplication.class, args);
	}

}
