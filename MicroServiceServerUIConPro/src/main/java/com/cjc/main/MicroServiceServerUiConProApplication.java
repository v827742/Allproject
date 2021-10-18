package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceServerUiConProApplication {

	public static void main(String[] args) {
		
		System.out.println("Ths Is I client of McroServce");
		SpringApplication.run(MicroServiceServerUiConProApplication.class, args);
	}

}
