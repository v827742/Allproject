package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceMainApplication {

	public static void main(String[] args) {
		
		System.out.println("Service Provider Class");
		SpringApplication.run(WebServiceMainApplication.class, args);
	}

}
