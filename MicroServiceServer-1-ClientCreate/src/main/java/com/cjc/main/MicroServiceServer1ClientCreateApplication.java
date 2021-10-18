package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@EnableEurekaClient
@SpringBootApplication
public class MicroServiceServer1ClientCreateApplication {

	public static void main(String[] args) {
		System.out.println("This is Create Client 1");
		SpringApplication.run(MicroServiceServer1ClientCreateApplication.class, args);
	}

}
