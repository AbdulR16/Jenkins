package com.example.demo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.model.Student;

@Configuration
public class AppConfig {
	
	//factory Method with a bean id same as method name - here it is ram
	
	@Bean         // describe how a object can be created                
	public Doctor ram(@Qualifier("tom") Patient tom) {
		
		return new Doctor(101,"Ram","chennai",tom);
	}
	
	//factory Method with a bean id same as method name - here it is shyam
	@Bean                     
	public Doctor shyam(@Qualifier("dick")Patient tom) {
		
		return new Doctor(101,"shyam","Mumbai",tom);
	}
	@Bean
	public Patient tom() {
		
		return new Patient(989,"tom",56);
	}
	@Bean
	public Patient dick() {
		
		return new Patient(990,"Dick",59);
	}
	@Bean
	public Patient harry() {
		
		return new Patient(991,"harry",69);
	}
	@Bean
	public Patient hari() {
		
		return new Patient(995,"hari",69);
	}
	@Bean
	public Patient venkat() {
		
		return new Patient(994,"venkat",69);
	}
	
	
	public Integer number() {
		
		return Integer.valueOf(100);
	}
	
	@Bean
	public Student harish() {
		
		Student stud = new Student();
		
		stud.setId(201);
		
		stud.setName("Harish");
		
				return stud;
	}
	
}
