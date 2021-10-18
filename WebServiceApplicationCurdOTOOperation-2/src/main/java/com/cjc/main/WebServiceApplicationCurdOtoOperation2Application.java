package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class WebServiceApplicationCurdOtoOperation2Application {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApplicationCurdOtoOperation2Application.class, args);
	}

}
