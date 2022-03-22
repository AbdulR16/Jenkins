package com.example.demo.mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.demo.stub.Invoice;
import com.example.demo.stub.InvoiceRepository;
import com.example.demo.stub.InvoiceService;



public class TestWithMockito {
	
	@DisplayName("Test findAll method in Invoice Service with Mockito")
	@Test
	void testFindAll() {
		
		InvoiceRepository repo = Mockito.mock(InvoiceRepository.class);
		
		InvoiceService service = new InvoiceService(repo);
		
		List<Invoice> invList = Arrays.asList(new Invoice(201,"sura",4858.00),new Invoice(202,"Anil",2521.00));
		
		Mockito.when(service.findAll()).thenReturn(invList);
		
		assertEquals(2, service.findAll().size());
	}

}
