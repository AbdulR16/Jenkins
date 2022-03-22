package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.repos.EmployeeService;

@SpringBootApplication
public class SpringMvcExample1Application {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringMvcExample1Application.class, args);
		
		EmployeeService service=ctx.getBean(EmployeeService.class);

		Employee emp = ctx.getBean(Employee.class);
		int option = sc.nextInt();

		switch(option) {
		case 1:
		System.out.println(service.add(emp));
		break;
		case 2:
				service.findAll().forEach(System.out::println);
				break;
		case 3:
			 service.update(emp);
		     break;
		case 4:
			System.out.println("enter which one delete");
			int id = sc.nextInt();
			 service.delete(id)
		;
			 break;
		}
				
				
				}
			@Bean
			public Employee Prem() {
				Employee emp = new Employee();
				emp.setEmp_no(669);
				emp.setEmp_name("Prem");
				emp.setJob("Salesman");
				emp.setSalary(30050);
				emp.setDept_no(23);
				return emp;
			}
			

		
	}


