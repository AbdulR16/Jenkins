package com.example.demo.dummy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InvoiceRepoImplementation implements InvoiceRepository {
	
	private List<Invoice> invList;
	
	public InvoiceRepoImplementation() {
		super();
		invList = new ArrayList<>();
	}
	
	@Override
	public int add(Invoice entity) {
		
		boolean result = invList.add(entity);
		
		return result?1:0; //ternary opertor
	}
	@Override
	public Collection<Invoice> findAll() {
			
		return this.invList;
	}

}


