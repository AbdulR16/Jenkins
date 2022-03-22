package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class LoanApplicationProcessingServiceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanApplicationProcessingServiceBApplication.class, args);
	}
	
	@Bean
	@LoadBalanced // we get output as good as score that is come from cibil score class we called that service
	public RestTemplate template() {
		
		return new RestTemplate();
	}

}
