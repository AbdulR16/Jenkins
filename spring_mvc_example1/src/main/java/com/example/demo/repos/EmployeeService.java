package com.example.demo.repos;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

@Service
public class EmployeeService {
	
	private EmployeeRepository repo;
	
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
		
		
	}
	public Employee add(Employee emp) {
		return this.repo.save(emp);
	}
	
	public List<Employee> findAll(){
		
		return this.repo.findAll();
	}
	public void delete(int id) {
		this.repo.deleteById(id)
;
	}
	public Employee update(Employee update) {
		
		return this.repo.save(update);
		
	} 
}



	


