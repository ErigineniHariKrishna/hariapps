package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@ComponentScan({"com.satya.controller","com.satya.service"})
@EntityScan("com.satya.model")
@EnableJpaRepositories("com.satya.dao")
public class SpringBootPaginationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPaginationApplication.class, args);
	}
}
