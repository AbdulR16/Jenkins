package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.CurrencyCoverterService;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringAopApplication.class, args);
		
		
		 CurrencyCoverterService service = ctx.getBean(CurrencyCoverterService.class);
		 
		 System.out.println(service.inrToEuro(10));
		 System.out.println(service.inrToUsd(5));
	}

}
