package com.example.demo.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestInvoiceServiceWithStub {
	
	@DisplayName("test findAll Return All Elements from the Collection")
	@Test
	void testFindAll() {
		
		InvoiceRepository invRepo = new InvoiceRepoStub();
		
		InvoiceService service = new InvoiceService(invRepo);
		
		int actual = service.findAll().size();
		
		int expected = 2;
		
		assertEquals(expected, actual);
	}

}
