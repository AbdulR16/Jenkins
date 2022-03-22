package com.example.demo.dummy;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class InvoiceService {
	
	private InvoiceRepository invRepo;
	
	private EmailRepositroy emailRepo;
	
	public int addInvoice(Invoice entity) {
		
		return this.invRepo.add(entity);
	}
	
	public Collection<Invoice> findAll(){
		
		return this.invRepo.findAll();
	}

}
