package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@SpringBootApplication
public class SpringDataJpaExcerciseApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext ctx =SpringApplication.run(SpringDataJpaExcerciseApplication.class, args);
		 
		 
		 Doctor doc = ctx.getBean(Doctor.class);
		 
		 DoctorService service = ctx.getBean(DoctorService.class);
		 
		 service.findAll().forEach(System.out::println);
		 
		 service.add(doc);
		 
		 //doc.setDoctorName("NTR");
		 
		 
	}
	
	public Doctor dec() {
		
		return new Doctor(924,"NTR",67545,"ahj@gmail.com","heart","porur");
	}
	
	

}
