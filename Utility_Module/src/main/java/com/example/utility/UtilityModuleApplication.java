package com.example.utility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.utility")
public class UtilityModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilityModuleApplication.class, args);
	}

}
