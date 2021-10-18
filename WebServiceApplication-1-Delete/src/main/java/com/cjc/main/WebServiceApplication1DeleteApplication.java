package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebServiceApplication1DeleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApplication1DeleteApplication.class, args);
	}

	@Bean
	public RestTemplate restTemp()
	{
		RestTemplate rt=new RestTemplate();
		return rt;
	}
}
