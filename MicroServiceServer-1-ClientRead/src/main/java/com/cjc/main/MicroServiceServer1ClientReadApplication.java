package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceServer1ClientReadApplication {

	public static void main(String[] args) {
		System.out.println("This IS Read Client 2");
		SpringApplication.run(MicroServiceServer1ClientReadApplication.class, args);
	}

}
