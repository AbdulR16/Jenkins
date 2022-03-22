package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping(path="/api/v1")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping(path="/customers")
	public List<Customer> getAllCustomers(){
		
		return this.service.getAllCustomers();
	}
	

}
