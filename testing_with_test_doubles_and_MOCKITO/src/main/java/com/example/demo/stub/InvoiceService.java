package com.example.demo.stub;

import java.util.Collection;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class InvoiceService {
	
	private InvoiceRepository invRepo;
	
	
	public int addInvoice(Invoice entity) {
		
		return this.invRepo.add(entity);
	}
	
	public Collection<Invoice> findAll(){
		
//		return this.invRepo.findAll().stream().filter(e ->e.getAmount()<50000.00)
//				.collect(Collectors.toList());
		
		return this.invRepo.findAll().stream()
				.collect(Collectors.toList());
	}

}
