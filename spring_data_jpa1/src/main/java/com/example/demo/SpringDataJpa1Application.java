package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.BloodDonor;
import com.example.demo.services.BloodDonorService;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext	ctx=SpringApplication.run(SpringDataJpa1Application.class, args);
	
	BloodDonor donor = ctx.getBean(BloodDonor.class);
	
	BloodDonorService service = ctx.getBean(BloodDonorService.class);
	
	//System.out.println(service.add(donor));
	
	//System.out.println(service.findAll());
	
	//service.findAll().forEach(System.out::println);
//	
//	donor.setDateLastDonated(LocalDate.now());
//	
	//donor.setFirstName("Magesh");
	//service.update(donor);
	//service.delete(donor.getMobileNumber());
	
//	donor.setDateLastDonated(LocalDate.now());
//	donor.setFirstName("ars group");
//	service.update(donor);
	//service.findByFirstName("Magesh").forEach(System.out::println);
	
	//service.findByGroupAndLastDonatedDate("bpos", LocalDate.of(2022, 01, 10)).forEach(System.out::println);
	
	service.updateLastDonated(LocalDate.now(),89089);
	service.findAll().forEach(System.out::println);
	
	
	}
	
	@Bean
	public BloodDonor abd() {
		
		return new BloodDonor(56798,"mabdul","bveg",LocalDate.now());
		
		}
	
	

}
