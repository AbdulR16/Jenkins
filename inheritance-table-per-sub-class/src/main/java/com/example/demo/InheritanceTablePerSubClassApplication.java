package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Milk;
import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class InheritanceTablePerSubClassApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(InheritanceTablePerSubClassApplication.class, args);
		
		ProductRepository repo = ctx.getBean(ProductRepository.class);
		
		Product milk = ctx.getBean(Milk.class) ;
		
		repo.save(milk);
		
		System.out.println(repo.save(milk));
		
	}
	
	@Bean
	public Milk milk() {
		
		return new Milk(999,"aavin milk",80.0,"aimilk","one day");
	}

}
