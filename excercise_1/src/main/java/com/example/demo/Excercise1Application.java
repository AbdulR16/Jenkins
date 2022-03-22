package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Excercise1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(Excercise1Application.class, args);
		
		System.out.println(ctx.getBean("abdul"));
		System.out.println(ctx.getBean("dhoni"));
	}

}
