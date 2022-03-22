package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

public class BookServiceTest {
	
	
	private BookService service;
	
	@BeforeAll
	public static void init() {
		
		System.out.println("Befor All called");
	}
	
	@BeforeEach
	public void setUp() {
		
		System.out.println("Before Each Called");
		
		service = new BookService();
		
	}
	
	@Test
	@DisplayName("getbook method should not return null values for choice 1 to 3")
	void testGetBookMethdNotNull() {
		
//		Book actual = service.getBook(2);
//		
//		assertNotNull(actual);
		
		assertAll("getBook method with choice 1 to 3",
				
				()-> assertNotNull(service.getBook(1)),
				()-> assertNotNull(service.getBook(2)),
				()-> assertNotNull(service.getBook(3))
				);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,2,3})
	void testGetBookMethodWithParam(int key) {
		
		assertNotNull(service.getBook(key));
	}
	
	
	
	
	@Test
	@DisplayName("getbook method should  return null values for choice 1 to 3")
	void testGetBookMethdNull() {
		
//		Book actual = service.getBook(2);
		
		assertNull(service.getBook(4));
	}
	
	@Test
	void testForException() {
		
		Throwable exception = assertThrows(RuntimeException.class,()->{
			
			service.getBook(-2);
			
			
		});
	}
	@Test
	@DisplayName("getDiscount Method should return 0.10 discount for price less than or equal to 200")
	void testForTenPercentDiscount() {
		
		Book book = service.getBook(3);
		double actual = service.getDiscount(book);
		double expected = 0.15;
		
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	@DisplayName("getDiscount Method should be completed with 100 ms")
	void testGetBookCompleteTiming() {
		//Book book = null;

		Book book = service.getBook(3);
		double actual = service.getDiscount(book);
		double expected = 0.15;
		
		assertTimeout(Duration.ofMillis(100), ()->service.getDiscount(book));
		
		assertEquals(expected, actual);
		
		
	}
	

	@Disabled("Disabled till timeout bug is fixed")
	@Test
	@DisplayName("getDiscount Method should return 0.05 discount ")
	void testGetBookTestFivePercentdiscount() {

		Book book = service.getBook(1);
		double actual = service.getDiscount(book);
		double expected = 0.05;

		assertEquals(expected,actual);
	}
	
	@Test
	public void dummyTest2() {
		
		System.out.println("Dummy 2");
		assertTrue(true);
	}
	
	
	@ParameterizedTest
	@ValueSource(ints = {1,3,5})
	@DisplayName("GetAllBook method sholud return a list with index" 
				+ "position 1,3,5 not being null")
	void testGetAllBooksPosition(int key) {
		
		//assertFalse(true,"not yet implemented");
		assertNotNull(service.getAll().get(key));
	}
	@AfterAll
	public static void destory() {
		
		System.out.println("After All called");
	}
	
	@AfterEach
	public void tearDown() {
		
		System.out.println("After Each Called");
		
	}

}
