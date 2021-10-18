package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceProduceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProduceApplication.class, args);
	}

}
