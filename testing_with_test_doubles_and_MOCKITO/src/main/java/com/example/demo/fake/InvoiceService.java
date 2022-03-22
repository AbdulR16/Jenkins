package com.example.demo.fake;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class InvoiceService {
	
	private InvoiceRepository invRepo;
	
	
	public int addInvoice(Invoice entity) {
		
		return this.invRepo.add(entity);
	}
	
	public int findAll(){
		
		return this.invRepo.findAll();
	}

}
