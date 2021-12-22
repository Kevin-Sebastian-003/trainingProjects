package com.example.bookgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BookgatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookgatewayApplication.class, args);
	}
}