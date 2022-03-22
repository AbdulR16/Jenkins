package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class LoanProcessingController {
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping(path="/loan")
	public String getCibilScore() {
		
		//replace the hostname and port number with serviceId
		//serviceiD is captued from eureka dash Board
		//it is same as the spring.application.name given in application.yml
		return this.template.getForObject("http://CIBIL-SCORE-SERVICE/api/v1/score", String.class);
	}

}
