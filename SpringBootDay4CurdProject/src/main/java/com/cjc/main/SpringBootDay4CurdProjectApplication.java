package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class SpringBootDay4CurdProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDay4CurdProjectApplication.class, args);
	}

}
