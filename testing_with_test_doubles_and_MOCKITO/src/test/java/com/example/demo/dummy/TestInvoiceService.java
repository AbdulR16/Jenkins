package com.example.demo.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestInvoiceService {
	
	@DisplayName("Test InvoiceService class addInvoice  method return 1 for successful insert")
	@Test
	void testForAddSuccess() {
		
		//Dependencies are created
		InvoiceRepository invRepo = new InvoiceRepoImplementation();
		EmailRepositroy emailRepo = new DummyemailRepo();
		
		//Dependencies are passed the second arugument is a dummy object
		InvoiceService service = new InvoiceService(invRepo, emailRepo);
		
		
		
		Invoice invoice = new Invoice(110,"Ramesh",450);
		
		
		//calling the method under test
		int actual = service.addInvoice(null);
		int expected =1;
		
		//asserting the behaviour
		assertEquals(actual, expected);
		
	}

}
