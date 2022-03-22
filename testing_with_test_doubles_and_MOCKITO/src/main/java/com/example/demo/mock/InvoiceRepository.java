package com.example.demo.mock;
import java.util.*;

public interface InvoiceRepository {
	
	public int add(Invoice entity);
	public Collection<Invoice> findAll();

}
