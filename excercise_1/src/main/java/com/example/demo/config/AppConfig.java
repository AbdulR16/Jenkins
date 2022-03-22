package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Invoice;

@Configuration
public class AppConfig {
	
	@Bean
	public Invoice abdul( Customer raja) {
		
		return new Invoice(101,raja,2000);
			
	}
	@Bean
	public Invoice dhoni( Customer ram) {
		
		return new Invoice(101,ram,2000);
			
	}
	
	@Bean
	public Customer raja() {
		
		return new Customer(901,"raja",889809,"abd@gmail.com");
	}
	
	@Bean
	public Customer ram() {
		
		return new Customer(902,"ram",965712,"bcd@gmail.com");
	}
	

}
