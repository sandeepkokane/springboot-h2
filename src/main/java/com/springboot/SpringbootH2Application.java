package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootH2Application.class, args);
		System.out.println("Spring Boot and H2");
	}

}
