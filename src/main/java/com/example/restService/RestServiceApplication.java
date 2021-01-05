package com.example.restService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {

		System.out.println("starting app");
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
