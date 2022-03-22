package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Licence;
import com.example.demo.repos.EmployeeRepository;
import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;




@SpringBootApplication
public class OneToOneCacheExcerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneCacheExcerciseApplication.class, args);
	}
	@Bean
	public Config hazelConfig() {
		
		return new Config().setInstanceName("one-one-mapping")
				.addMapConfig(new MapConfig().setName("compcache"));
	}
	@Bean
	public CommandLineRunner runner() { // it is a bean it is called when the ioc container needs
		
		return new CommandLineRunner() {
			
			@Autowired
			private EmployeeRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				
				Licence licence = new Licence(201,LocalDate.of(2000, 8, 8),"20022");
				
				Employee employee = new Employee(200, "Abdul", licence);
				
				this.repo.save(employee);

				
				
			}
		};
	}
}



