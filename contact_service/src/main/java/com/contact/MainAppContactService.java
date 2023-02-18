package com.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MainAppContactService {

	public static void main(String[] args) {
		SpringApplication.run(MainAppContactService.class, args);
	}

}
