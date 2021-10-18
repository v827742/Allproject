package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceCreateEureka2Application {

	public static void main(String[] args) {
		
		
		System.out.println("this is create");
		SpringApplication.run(MicroServiceCreateEureka2Application.class, args);
	}

}
