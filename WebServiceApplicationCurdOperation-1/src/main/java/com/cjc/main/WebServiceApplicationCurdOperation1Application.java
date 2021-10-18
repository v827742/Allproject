package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class WebServiceApplicationCurdOperation1Application {

	public static void main(String[] args) {
		
		System.out.println("Application WebService List Of Data Add Curd Operation");
		SpringApplication.run(WebServiceApplicationCurdOperation1Application.class, args);
	}

}
