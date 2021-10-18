package com.cjc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebdemoRunMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebdemoRunMethodApplication.class, args);
		System.out.println("Hello run method");
	}

}
