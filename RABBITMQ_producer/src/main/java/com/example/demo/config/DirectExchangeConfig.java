package com.example.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;

@Configuration
public class DirectExchangeConfig {
	
	public static final String EXCHANGE_NAME = "Student_exchange";
	
	public static final String ROUTING_KEY = "campus_2021";
	
	@Bean
	public Queue myQueue() {
		
		return new Queue(ROUTING_KEY,false);
		
	}
	
	@Bean
	public DirectExchange directExchange() {
		
		return new DirectExchange(EXCHANGE_NAME);
	}
	
	@Bean
	public Binding directBinding(DirectExchange directExchange,Queue myQueue) {
		
		return BindingBuilder.bind(myQueue).to(directExchange).with(ROUTING_KEY);
		
		
	}
	
	@Bean
	public Jackson2JsonMessageConverter messageConveter() {
		
		return new Jackson2JsonMessageConverter();
	}
	
	@Bean
	public RabbitTemplate template(ConnectionFactory factory) {
		
		RabbitTemplate template = new RabbitTemplate(factory);
		
		template.setMessageConverter(messageConveter());
		
		return template;

	}

}
