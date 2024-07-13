package com.sbmslearn.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for the Accounts service.
 * Uses Spring Boot's @SpringBootApplication annotation to enable auto-configuration.
*/

@SpringBootApplication
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);

	}

}
