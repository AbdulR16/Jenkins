package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class ChildController {
	
	
	@Autowired
	RestTemplate template;
	
	@GetMapping("/child")
	public String getMesssage() {
		
		return template.getForObject("http://service-parent:8090/parent", String.class);
	}
}
