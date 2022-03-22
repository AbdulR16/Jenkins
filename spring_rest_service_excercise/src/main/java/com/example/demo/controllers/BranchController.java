package com.example.demo.controllers;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Branch;
import com.example.demo.service.BranchService;

@RestController
@RequestMapping(path="/api/v2")
public class BranchController {
	
	@Autowired
	BranchService service;
	
	@GetMapping(path="/branches")
	@RolesAllowed( {"ROLE_ADMIN","ROLE_GUEST"})
	public List<Branch> getAllBranch(){
		
		return this.service.getAllBranch();
	}
	
	@PostMapping(path="/branches")
	public Branch addBranch(@RequestBody Branch entity) {
		
		return this.service.addBranch(entity);
	}
	
	

}
