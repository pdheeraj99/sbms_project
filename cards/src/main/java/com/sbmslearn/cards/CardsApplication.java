package com.sbmslearn.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for the Cards service.
 * Uses Spring Boot's @SpringBootApplication annotation to enable auto-configuration.
*/

@SpringBootApplication
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
