package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.OrderService;

@SpringBootApplication
public class Excercise2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Excercise2Application.class, args);
		
		
//		System.out.println(ctx.getBean("abdul"));
//		System.out.println(ctx.getBean("book"));
//		System.out.println(ctx.getBean("pencil"));
//		System.out.println(ctx.getBean("rubber"));
		//System.out.println(ctx.getBean("itemList"));
		//System.out.println(ctx.getBean("salesOrder"));
		
		     OrderService service =ctx.getBean(OrderService.class);
		     
		     
		     
		     service.getSalesOrder().getItemList().forEach(System.out::println);
		     
		     System.out.println(service.findTotal());
		    
	}

}
