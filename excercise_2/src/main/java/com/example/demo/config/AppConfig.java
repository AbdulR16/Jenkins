package com.example.demo.config;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Item;
import com.example.demo.model.SalesOrder;

@Configuration // this class acts as a source of bean Definitions
public class AppConfig {
	

	
	@Bean
	public Item book() {
		
		return new Item(101,"book",100.0,6000.0);
	}
	@Bean
	public Item pencil() {
	
	return new Item(102,"pencil",150.0,700.0);
	
}
	@Bean
	public Item rubber() {
		return new Item(103,"rubber",200.0,100.0);		
	}
	
	@Bean
	public Customer abdul() {
		
		return new Customer(1,"abdul","chennai");
	}
	
	@Bean
	public Integer number() {
		
		return Integer.valueOf(100);
	}
	
	
	@Bean
	public LocalDate date() {
		
		return LocalDate.now();
		
	}
	
	
	
	
//	@Bean
//	public List<Item> itemList (){
//		
//		List<Item> itemList = new ArrayList<Item>();
//		itemList.add(new Item(101,"book",100.0,6000.0));
//		itemList.add(new Item(102,"pencil",150.0,700.0));
//		itemList.add(new Item(103,"rubber",200.0,100.0));
//		
//		return itemList ;
//	}
	

}
