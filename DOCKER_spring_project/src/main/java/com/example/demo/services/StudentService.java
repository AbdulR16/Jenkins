package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repos.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public Student add(Student entity) {
		
		return this.repo.save(entity);
		
	}
	
	public Optional <Student> searchById(int id) {
		
		return this.repo.findById(id);
	}
	
	public List<Student> findAll(){
		
		return this.repo.findAll();
	}
	 
	public List<Student> findByName(String srchName){
		
		return repo.findByStudentName(srchName);
	}
	
	public Optional <Student> remove(Student entity){
		
		Optional <Student> value = Optional.empty();
		
		if(this.repo.existsById(entity.getRollNumber())) {
			
			this.repo.delete(entity);
		
		value=Optional.of(entity);
		}		
		return value;
	}
	public Optional<Object> removeById(int id){
		Optional<Object> value = Optional.empty();
		if(repo.existsById(id)) {
		repo.deleteById(id);
		value=Optional.of(id);
		}

		return value;
		}
	
	public Student updateStudent(Student entity) {
		
		return this.repo.save(entity);
	}
	public int updatedMark(int rollnumber,double latestmark) {
		
		return this.repo.updateMark(rollnumber, latestmark);
	}
	
	public List<Student> sortByProperty(String propName){
		
		Sort sort =Sort.by(propName).descending();
		
		return repo.findAll(sort);
		
		}
	public List<Student> findByPage(int page,int size){
		
		Pageable pageable = PageRequest.of(page, size);
		
		Page<Student> pageRef = this.repo.findAll(pageable);
		
		System.out.println("Total pages"+ pageRef.getTotalPages());
		System.out.println("Total lines"+ pageRef.getTotalElements());
		
		if(pageRef.hasContent()) {
			
			return pageRef.getContent();
		}else {
			
			return new ArrayList<>();
		}
	}
}
