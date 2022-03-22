package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Professor {
	
	
	private int id; // simple values
	private Student student; // reference to other bean
	public Professor() {
		super();
		
		System.out.println("zero===");
		// TODO Auto-generated constructor stub
	}
	//@Autowired
	public Professor(int id, Student student) {
		super();
		
		System.out.println("parametrized== ");
		this.id = id;
		this.student = student;
	}
//	@Autowired
//	public Professor(Student student) {
//		super();
//		this.student = student;
//	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}

}
