package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Chocolates;
import com.example.demo.repo.ChocoRepository;

@Controller
public class ChocoController {
	
	@Autowired
	ChocoRepository repo;
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	@RequestMapping("/addchoco")
	public String addChoco(Chocolates chocolates) {
		
		
		repo.save(chocolates);
		return "home.jsp";
	}
}
