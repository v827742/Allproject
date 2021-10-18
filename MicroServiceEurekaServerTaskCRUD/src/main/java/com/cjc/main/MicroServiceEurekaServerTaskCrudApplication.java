package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroServiceEurekaServerTaskCrudApplication {

	public static void main(String[] args) {
		System.out.println("Eureka server for Crud");
		SpringApplication.run(MicroServiceEurekaServerTaskCrudApplication.class, args);
	}

}
