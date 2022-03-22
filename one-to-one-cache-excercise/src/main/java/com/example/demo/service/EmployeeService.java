package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repos.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {
	
	private EmployeeRepository repo;
	
	public List<Employee> findAll(){
		
		return this.repo.findAll();
	}
	
	public Employee add(Employee entity) {
		
		return this.repo.save(entity);
	}
	
	@Cacheable(cacheNames="empcache",key="#id")
	public Optional<Employee> findById(int id) {
		
		return this.repo.findById(id);
	}
	
	@CacheEvict(cacheNames = "empcache",key="#id")
	public void delete(int id) {
		
		this.repo.deleteById(id);
	}
	@CachePut(cacheNames="empcache",key="entity.empId")
	public Employee update(Employee entity) {
		
		return this.repo.save(entity);
	}
}
