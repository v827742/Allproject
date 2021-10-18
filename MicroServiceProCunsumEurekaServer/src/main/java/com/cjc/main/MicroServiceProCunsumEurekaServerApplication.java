package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class MicroServiceProCunsumEurekaServerApplication {

	public static void main(String[] args) {
		System.out.println("This is Eureka erver ");
		SpringApplication.run(MicroServiceProCunsumEurekaServerApplication.class, args);
	}

}
