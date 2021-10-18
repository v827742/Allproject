package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceTaskCrudRead1Application {

	public static void main(String[] args) {
		System.out.println("This Is MicroService Client Update");
		SpringApplication.run(MicroServiceTaskCrudRead1Application.class, args);
	}

}
