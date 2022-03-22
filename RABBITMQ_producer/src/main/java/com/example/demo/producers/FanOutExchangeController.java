package com.example.demo.producers;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.FanoutExchangeConfig;
import com.example.demo.model.Student;

@RestController
@RequestMapping(path="/api/v2")
public class FanOutExchangeController {

	@Autowired
	RabbitTemplate template;
	
	@PostMapping("/students")
	public String sendMessage(@RequestBody Student student) {
		
		template.convertAndSend(FanoutExchangeConfig.EXCHANGE_NAME,"",student);
		
		 return "Message Sent to fanout Exchange";
		
	}
}
