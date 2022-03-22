package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Loan;
import com.example.demo.repos.LoanRepository;

@Service
public class LoanService {
	
	@Autowired
	private LoanRepository repo;
	
	public Loan add(Loan entity) {
		
		return this.repo.save(entity);
	}
	
	public List<Loan> getAll() {
		
		return this.repo.findAll();
	}
	
	public Optional<Object> deleteById(int id){
		Optional<Object> value = Optional.empty();
		if(repo.existsById(id)) {
		  repo.deleteById(id);
		  value=Optional.of(id);
		}

		return value;
		}
	public Loan updateStudent(Loan entity) {
		
		return this.repo.save(entity);
	} 
}


