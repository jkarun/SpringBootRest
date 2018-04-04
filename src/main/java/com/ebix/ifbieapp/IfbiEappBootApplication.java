package com.ebix.ifbieapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class IfbiEappBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(IfbiEappBootApplication.class, args);
	}
	
}
