package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.training.model.Professor;

import com.example.demo.model.Student;

import excella.project.assignment.College;

@SpringBootApplication //scan path
@ComponentScan(basePackageClasses = {Professor.class,Student.class,College.class})
public class UnderstandingComponentScanApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx	=SpringApplication.run(UnderstandingComponentScanApplication.class, args);
	
	System.out.println("Student ="+ctx.getBean("udhaya",Student.class));
	System.out.println(ctx.getBean("jaya",Professor.class));
	System.out.println(ctx.getBean("mep",College.class));
	}

	@Bean
	@Primary

	public Student udhaya() {
		
		Student ram = new Student();
		
		ram.setId(2020);
		ram.setFirstName("udhaya");
		
		return ram;
	}
	
	@Bean
	public Student jagan() {
		
		Student jagan = new Student();
		
		jagan.setId(209);
		jagan.setFirstName("jagan");
		
		return jagan;
	}
	@Bean
	@Primary
	public Professor jaya() {
		
		Professor prof = new Professor();
		
		prof.setId(2023);
		prof.setName("Jayalalitha");
		
		prof.setStudent(jagan());
		
		return prof;
	}
	@Bean
	
	public College mep() {
		
		College clg = new College();
		
		clg.setProf(jaya());
		
		return clg;
		
	}
}
