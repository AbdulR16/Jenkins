package com.example.demo.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWithMock {
	
	@DisplayName("test method")
	@Test
	public void testAddMethod() {
		
		MockInvoiceRepo mock = new MockInvoiceRepo();

		InvoiceService service = new InvoiceService(mock);

		Invoice inv1 = new Invoice(901, "tom", 4848);
		Invoice inv2=new Invoice(902, "jerry", 5600);

		service.addInvoice(inv1);
		

	    mock.verify(inv2, 2);

		service.addInvoice(inv2);

	}

}
