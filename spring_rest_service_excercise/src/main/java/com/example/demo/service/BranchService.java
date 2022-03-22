package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Branch;
import com.example.demo.repos.BranchRespository;

@Service
public class BranchService {
	
	
	
	@Autowired
	private BranchRespository repo;
	
	
	public List<Branch> getAllBranch(){
		
		return this.repo.findAll();
	}
	
	public Branch addBranch(Branch entity) {
		
		return this.repo.save(entity);
	}

}
