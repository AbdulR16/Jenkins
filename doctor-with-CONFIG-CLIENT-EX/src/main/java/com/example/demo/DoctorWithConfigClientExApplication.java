package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.example.demo.repos.DoctorRepository;

@SpringBootApplication
public class DoctorWithConfigClientExApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorWithConfigClientExApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			DoctorRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				
				System.out.println(repo.findAll());
				// TODO Auto-generated method stub
				
			}
		};

}
}