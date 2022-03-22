package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParentController {
	
	@GetMapping("/parent")
	public String getMesssage() {
		
		return "Hello  From Parent";
	}

}
