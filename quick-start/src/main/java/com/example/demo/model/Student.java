package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int id;
	private String name;
	public Student() {
		super();
		System.out.println("Student created ====");
	}
	public int getId() {
		return id;
	}
	//@Autowired
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	
	//@Autowired
	public void setName(String name) {
		this.name = name;
	}

}
