package com.example.demo.fake;

import java.util.Collection;
import java.util.HashMap;



public class FakeInvoRepoImpl implements InvoiceRepository {

	
	private HashMap<Integer, Invoice> invList;
	
	
	
	public FakeInvoRepoImpl() {
		super();
		
		invList = new HashMap<>();
	}

	@Override
	public int add(Invoice entity) {
		
		Invoice added =  invList.put(entity.getInvoiceNumber(), entity);
		
		return (added!= null)? 0:1;
	}

	@Override
	public int findAll() {
		
		return invList.values().size();
	}

}
