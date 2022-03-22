package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
	
	@RequestMapping(value ="/greet",method =RequestMethod.GET)
	@ResponseBody
	public String message() {
		
		return "spring MVC";
	}
	
	@RequestMapping(value ="/thanks",method =RequestMethod.GET)
	@ResponseBody
	public String thanksMessage() {
		
		return "thanks MVC";
	}
	  

	}


