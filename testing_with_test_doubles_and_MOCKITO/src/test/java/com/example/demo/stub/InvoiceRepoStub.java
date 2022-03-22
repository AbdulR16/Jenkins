package com.example.demo.stub;

import java.util.Arrays;
import java.util.Collection;

public class InvoiceRepoStub implements InvoiceRepository {

	@Override
	public int add(Invoice entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<Invoice> findAll() {
		// TODO Auto-generated method stub
		return Arrays.asList(new Invoice(101,"Ram",455),new Invoice(102,"Suresh",466));
	}

}
