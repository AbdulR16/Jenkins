package com.example.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicExchangeConfig {
	
	public static final String EXCHANGE_NAME="tp_trainee_exchange";
	
	public static final String ROUTING_KEY = "*.campus.*";
	
	public static final String QUEUE1="tp.campus.2022";
	
	public static final String QUEUE2="tp.campus.2023";
	
	public static final String QUEUE3="tp.mega.2023";
	
	

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
	public Binding binding1(Queue queue, TopicExchange exchange) {
		
	return BindingBuilder.bind(myqueue3()).to(exchange).with(ROUTING_KEY);
	}
	
	@Bean
	public Binding binding2(Queue queue, TopicExchange exchange) {
		
	return BindingBuilder.bind(myqueue4()).to(exchange).with(ROUTING_KEY);
	}
	
	@Bean
	public Binding binding3(Queue queue, TopicExchange exchange) {
		
	return BindingBuilder.bind(myqueue5()).to(exchange).with(ROUTING_KEY);
	}


	}

	
	


