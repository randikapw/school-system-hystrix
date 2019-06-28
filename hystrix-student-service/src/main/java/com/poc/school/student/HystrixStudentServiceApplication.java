package com.poc.school.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HystrixStudentServiceApplication {
	
	// Ref : https://howtodoinjava.com/spring-cloud/spring-hystrix-circuit-breaker-tutorial/
	
	public static void main(String[] args) {
		SpringApplication.run(HystrixStudentServiceApplication.class, args);
	}

}
