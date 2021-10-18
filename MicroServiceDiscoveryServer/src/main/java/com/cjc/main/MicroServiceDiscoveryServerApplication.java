package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MicroServiceDiscoveryServerApplication {

	public static void main(String[] args) {
		
		System.out.println("This Is Eureka Server");
		SpringApplication.run(MicroServiceDiscoveryServerApplication.class, args);
	}

}
