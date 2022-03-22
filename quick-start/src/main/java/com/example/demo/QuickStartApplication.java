package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.College;
import com.example.demo.model.Professor;
import com.example.demo.model.Student;

@SpringBootApplication
public class QuickStartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(QuickStartApplication.class, args);
		
				// ctx is the IOC container
				//appconfig@bean method metadata configuration
				//pojo doctor class
		
		System.out.println(ctx.getBean("ram"));
		System.out.println(ctx.getBean("shyam")); // ctx rep of ioc container
		
		System.out.println(ctx.getBean("hospital"));
		
		
		//even if we called 
		System.out.println(ctx.getBean(Professor.class));
		System.out.println(ctx.getBean(Professor.class));
		System.out.println(ctx.getBean(Professor.class));
		
		//System.out.println(ctx.getBean("professor"));
		
		//Professor prof = ctx.getBean(Professor.class);
		
		
		//System.out.println("Exepected:null +actual:="+ prof.getStudent());
		
		College college = ctx.getBean(College.class);
		
		System.out.println(college.getProf());
		
		System.out.println("Student : -------"+ctx.getBean("harish",Student.class));
		
			}
	
	

}
