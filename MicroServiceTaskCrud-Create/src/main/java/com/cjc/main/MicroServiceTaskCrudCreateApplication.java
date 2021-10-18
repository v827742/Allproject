package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroServiceTaskCrudCreateApplication {

	public static void main(String[] args) {
		
		System.out.println("This Is Eureka client Create");
		SpringApplication.run(MicroServiceTaskCrudCreateApplication.class, args);
	}

}
