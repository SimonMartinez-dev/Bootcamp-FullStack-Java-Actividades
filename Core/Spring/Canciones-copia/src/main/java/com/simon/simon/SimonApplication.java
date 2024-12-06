package com.simon.simon;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.simon")
public class SimonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimonApplication.class, args);
	}

}
