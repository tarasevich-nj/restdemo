package com.tnj.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class RestdemoApplication
{
	public static void main(String[] args) {
		SpringApplication.run(RestdemoApplication.class, args);
	}
}
