package com.splitthefeatures.cousineapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CousineApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CousineApiApplication.class, args);
	}
}
