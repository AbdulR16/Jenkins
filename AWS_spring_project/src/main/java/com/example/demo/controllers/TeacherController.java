package com.example.demo.controllers;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path="/api/v2")
public class TeacherController {
	
	@GetMapping(path="/teachers")
	public String getMessage(Principal principal) {
		
		System.out.println("Current User:="+principal.getName());
		return "Hello from Teacher Controller";
	}

}
