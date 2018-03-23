package com.ebix.ifbieapp;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.ebix.ifbieapp.model.Car;
import com.ebix.ifbieapp.repository.CarRepository;

@SpringBootApplication
public class IfbiEappBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(IfbiEappBootApplication.class, args);
	}
	
}
