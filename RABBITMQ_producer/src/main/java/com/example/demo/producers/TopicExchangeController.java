package com.example.demo.producers;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.TopicExchangeConfig;
import com.example.demo.model.Student;

@RestController
@RequestMapping("/api/v3")
public class TopicExchangeController {
	
	@Autowired
	RabbitTemplate template;
	
	@PostMapping("/students/{key}")
	public String sendMessage(@RequestBody Student student,@PathVariable int key) {
		
		String routeKey = "tp.excella.2022";
		
		if(key==2022) {
			
			routeKey = "tp.campus.2022";
			
		}
		
		template.convertAndSend(TopicExchangeConfig.EXCHANGE_NAME,
					TopicExchangeConfig.ROUTING_KEY,student);
		
		 return "Message Sent from Topic";
		
	}


}
