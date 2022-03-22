package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Complaint;
import com.example.demo.entity.Customer;
import com.example.demo.repos.CustomerRepository;
import com.example.demo.service.CustomerService;

@SpringBootApplication
public class JpaOneToManyApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext ctx = SpringApplication.run(JpaOneToManyApplication.class, args);
		 
		// CustomerRepository repo = ctx.getBean(CustomerRepository.class);
		 
//		 Customer ram = ctx.getBean(Customer.class);
//		 
//		 
//		 ram.setCustomerName("Ram Babu");
//		 ram.setLocation("Chennai");
//		 ram.setMobileNumber(9087098);
//		 
//		 Customer added = repo.save(ram);
		 
//		 CustomerService service = ctx.getBean(CustomerService.class);
//		 
//		 Customer elementToAdd = service.createCustomer();
//		 
//		// Customer added = repo.save(elementToAdd);
//		 
//		 //System.out.println("Row Added" + added);
//		 
//		List <Customer> custList = repo.findAll();
//		
//		for(Customer cust:custList) {
//			
//			System.out.println("Customer Name="+cust.getCustomerName());
//			System.out.println("Location="+ cust.getLocation());
//			System.out.println("Mobile Number=" + cust.getMobileNumber());
//			
//			System.out.println("Complaint History");
//			
//			
//			cust.getCompList().forEach(System.out::println);
		}
		 
	//}
	
	@Bean
	public Complaint comp1() {
		
		return new Complaint("fridge not working","comp");
	}
	@Bean
	public Complaint comp2() {
		
		return new Complaint("Ac not working","pend");
	}
	@Bean
	public Complaint comp3() {
		
		return new Complaint("Washing Machine Not washing","comp");
	}

}
