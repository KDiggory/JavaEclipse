package com.example.starterproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StarterProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterProjectApplication.class, args);
	}
	@Bean
	public String greeting() {
		return "Hello, World";
	}
	

}
