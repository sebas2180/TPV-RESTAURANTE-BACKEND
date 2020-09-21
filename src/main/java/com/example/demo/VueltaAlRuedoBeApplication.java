package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.example.Repository" })
//@EnableAutoConfiguration
@ComponentScan({  "com.example.service" ,"com.example.interfa"})
@EntityScan("com.example.model")
@ComponentScan(basePackages = "com.example.controller")
 @ComponentScan(basePackages = { "com.example.Repository.personaRepository" })
@ComponentScan(basePackages = { "com.example.Repository.articuloRepository" })
 
 
 
public class VueltaAlRuedoBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueltaAlRuedoBeApplication.class, args);
	}

}
