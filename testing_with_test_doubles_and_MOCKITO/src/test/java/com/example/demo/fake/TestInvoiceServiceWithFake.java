package com.example.demo.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




public class TestInvoiceServiceWithFake {
	
	@DisplayName("Test InvoiceService class addInvoice  method "
					+"should return 0 if no elemets is present with the key else"
			+"1 if there is already an element")
	@Test
	void testForAddSuccess() {
		
		InvoiceRepository repo = new FakeInvoRepoImpl();
		
		InvoiceService service = new InvoiceService(repo);
		
		service.addInvoice(new Invoice(102,"bcd", 110));
		

		
		//calling the method under test
		int actual =  service.findAll();
		int expected =1;
		
		//asserting the behaviour
		assertEquals(expected, actual);

		
	}

}
