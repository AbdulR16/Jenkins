package com.example.demo.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Complaint;
import com.example.demo.entity.Customer;
import com.example.demo.repos.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	List<Complaint> complaintList;
	
	@Autowired
	Customer customer;
	
	public Customer createCustomer() {
		
		customer.setCustomerName("Shyam");
		customer.setLocation("Madurai");
		customer.setMobileNumber(787978);
		
		customer.setCompList(complaintList);
		
		
		
		return customer;
	}
	
	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> getAllCustomers(){
		
		return this.repo.findAll();
	}
	
}
