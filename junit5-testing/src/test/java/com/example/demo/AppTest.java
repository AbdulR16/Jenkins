package com.example.demo;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AppTest 

{
	//static Greeting getObj;
	 Greeting grtObj;
	 
	@BeforeAll
	public static void init() {
		
		System.out.println("Before All Called");
		//grtObj = new Greeting();
	}
	
	@BeforeEach
	public  void startUp() {
		
		System.out.println("Before Each Called");
		
		grtObj = new Greeting();
	}
	
	
	
	
	
	@Test
	public void testGreetMethodRerturnNull() {
		
		
		
		String actual = grtObj.getMessage();
		
		assertNull(actual);
	}
	
	@Test
	public void testGreetMethodRerturnNotNull() {
		
		
		
		String actual = grtObj.getMessage();
		
		assertNotNull(actual);
	}
	
	@Test
	@DisplayName(value="To Test the method return String with Hello")
	public void testGreetMethodRerturnString() {
		
		
		
		String actual = grtObj.getMessage();
		
		assertNotNull(actual);
	}
	@Test
	public void testCurrencyShouldNotNegative() {
		
		CurrencyConverter conv = new CurrencyConverter();
		
		double actual = conv.usdToInr(50.00);
		
		assertTrue(actual>0);
}
	@Test
	public void testCurrencyShouldBeNegative() {
		
		CurrencyConverter conv = new CurrencyConverter();
		
		double actual = conv.usdToInr(50.00);
		
		assertTrue(actual<0);
	
}
}