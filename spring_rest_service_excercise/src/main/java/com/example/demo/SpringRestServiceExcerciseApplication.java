package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.model.Loan;

@SpringBootApplication
public class SpringRestServiceExcerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestServiceExcerciseApplication.class, args);
	}
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		
		return new BCryptPasswordEncoder();
	}

}
