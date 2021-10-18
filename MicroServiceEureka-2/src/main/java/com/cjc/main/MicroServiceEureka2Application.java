package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroServiceEureka2Application {

	public static void main(String[] args) {
		
		
		
		System.out.println("This Is Eureka Server Own Task");
		
		SpringApplication.run(MicroServiceEureka2Application.class, args);
	}

}
