package com.example.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.config.DirectExchangeConfig;
import com.example.demo.config.TopicExchangeConfig;
import com.example.demo.model.Student;

@Component
public class StudentConsumer {
	
	@RabbitListener(queues = DirectExchangeConfig.ROUTING_KEY)
    public void consumeMessageFromQueue(Student obj) {
        System.out.println("Message recieved from queue : " + obj);
    }
	
	@RabbitListener(queues = "btech_2022")
	public void consumeMessageFromFanOutQueue1(Student obj) {
		
		System.out.println("message received from fanout"+ obj);
	}
	@RabbitListener(queues = "mtech_2022")
	public void consumeMessageFromFanOutQueue2(Student obj) {
		
		System.out.println("message received from fanout exchange"+ obj);
	}
	
	@RabbitListener(queues = TopicExchangeConfig.QUEUE1)
	public void consumeMessageFromTopicQueue1(Student obj) {
		
		System.out.println("From Campus 22 Best Student"+ obj);
	}
	
	@RabbitListener(queues = TopicExchangeConfig.QUEUE2)
	public void consumeMessageFromTopicQueue2(Student obj) {
		
		System.out.println("From Campus 23 Best Student"+ obj);
	}
	
	@RabbitListener(queues = TopicExchangeConfig.QUEUE3)
	public void consumeMessageFromTopicQueue3(Student obj) {
		
		System.out.println("From mega 23 Best Student ="+ obj);
	}
}
