package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroServiceServer1ClientDelete1Application {

	public static void main(String[] args) {
		
		System.out.println("This is Delete Client 3");
		SpringApplication.run(MicroServiceServer1ClientDelete1Application.class, args);
	}

}
