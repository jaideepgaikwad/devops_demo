package com.siemens.devopsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DevopsdemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DevopsdemoApplication.class, args);
	}
}
