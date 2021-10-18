package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceApplicationCunsumeApplication {

	public static void main(String[] args) {
		System.out.println("Web Application Produce");
		SpringApplication.run(WebServiceApplicationCunsumeApplication.class, args);
	}

}
