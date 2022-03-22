package com.example.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicExchangeConfig {
	
	public static final String QUEUE1 = "tp_campus_2022";
	
	public static final String QUEUE2 = "tp_campus_2023";
	
	public static final String QUEUE3 = "tp_excella_2023";
	
	 public static final String EXCHANGE_NAME= "tp_trainee_exchange";
	 
	 public static final String ROUTING_KEY = "*.campus.*";
	
	

	@Bean
	public Queue myqueue3() {
	
		return new Queue(QUEUE1,false);
		
	}
	
	@Bean
	public Queue myqueue4() {
	
		return new Queue(QUEUE2,false);
		
	}
	@Bean
	public Queue myqueue5() {
	
		return new Queue(QUEUE3,false);
		
	}
	
	@Bean
	public TopicExchange exchange() {
		
	return new TopicExchange(EXCHANGE_NAME);
	}
	
	@Bean
	public Binding binding1() {
		
	return BindingBuilder.bind(myqueue3()).to(exchange()).with("*.campus.*");
	}
	
	@Bean
	public Binding binding2() {
		
	return BindingBuilder.bind(myqueue4()).to(exchange()).with("*.campus.*");
	}
	
	@Bean
	public Binding binding3() {
		
	return BindingBuilder.bind(myqueue5()).to(exchange()).with("*.excella.*");
	
	}


	}

	
	


