package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceConsumeApplication {

	public static void main(String[] args) {
		System.out.println("This Is Consume Client");
		SpringApplication.run(MicroServiceConsumeApplication.class, args);
	}

	
	@Bean
	public RestTemplate rete()
	{
		RestTemplate rt=new RestTemplate();
		
		return rt;
	}
}
