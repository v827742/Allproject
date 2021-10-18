package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroServiceClientAddmissionApplication {

	public static void main(String[] args) {
		System.out.println("this is client addmission App");
		SpringApplication.run(MicroServiceClientAddmissionApplication.class, args);
	}

}
