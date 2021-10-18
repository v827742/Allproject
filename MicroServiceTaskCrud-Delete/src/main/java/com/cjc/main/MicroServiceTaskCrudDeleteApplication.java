package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroServiceTaskCrudDeleteApplication {

	public static void main(String[] args) {
		System.out.println("This Is Miceroservice Client Delete");
		SpringApplication.run(MicroServiceTaskCrudDeleteApplication.class, args);
	}

}
