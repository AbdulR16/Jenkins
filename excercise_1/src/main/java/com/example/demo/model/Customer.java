package com.example.demo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {
	
	int customerId;
	String customerName;
	long mobileNumber;
	String email;
	

}
