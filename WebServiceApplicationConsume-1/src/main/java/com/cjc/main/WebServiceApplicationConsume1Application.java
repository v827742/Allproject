package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebServiceApplicationConsume1Application {

	public static void main(String[] args) {
		
		System.out.println("Consume Class");
		SpringApplication.run(WebServiceApplicationConsume1Application.class, args);
	}

	@Bean
	public RestTemplate restTemp()
	{
		RestTemplate rt=new RestTemplate();
		return rt;
	}
}
