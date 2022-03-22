package com.example.demo.fake;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
	
	int invoiceNumber;
	String customerName;
	double amount;
	

}
