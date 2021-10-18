package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroServiceServer1ClientUpdateApplication {

	public static void main(String[] args) {
		System.out.println("This is Update Client 3");
		SpringApplication.run(MicroServiceServer1ClientUpdateApplication.class, args);
	}

}
