package com.example.demo.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

public class MockInvoiceRepo implements InvoiceRepository {
	
	int count= 0;
	Invoice lastAdded;

	@Override
	public int add(Invoice entity) {
		
		count++;
		lastAdded = entity;
		return 1;
	}

	@Override
	public Collection<Invoice> findAll() {


		return null;
	}
	
	public void verify(Invoice inv, int total) {

		assertEquals(count, total);
		assertEquals(lastAdded, inv);

		}

}
