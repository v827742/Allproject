package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceTaskCrudReadApplication {

	public static void main(String[] args) {
		
		System.out.println("Thi Is MicroService Eureka Client Read");
		SpringApplication.run(MicroServiceTaskCrudReadApplication.class, args);
	}

}
