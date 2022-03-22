package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data

@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class OrderService {
	
	
	SalesOrder salesOrder;

	
	public double findTotal() {
		
		
		
		List<Item> totalList =	salesOrder.getItemList();
		double total = 0;
		for (Item item : totalList) {
				double qty=item.getQuantity();
				double price=item.getRatePerUnit();
				total+=(qty*price);
		}
	 		return total;
			
		}
	
	@Autowired
	public OrderService(SalesOrder salesOrder) {
		super();
		this.salesOrder = salesOrder;
	}

}
