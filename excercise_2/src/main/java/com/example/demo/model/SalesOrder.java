package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class SalesOrder {
	
		int orderId;
		LocalDate createdDate;
		Customer customer;
		List<Item> itemList;
		
		@Autowired
		public SalesOrder(int orderId, LocalDate createdDate, Customer customer, List<Item> itemList) {
			super();
			this.orderId = orderId;
			this.createdDate = createdDate;
			this.customer = customer;
			this.itemList = itemList;
		}
		
		//@Autowired
		public SalesOrder() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public LocalDate getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(LocalDate createdDate) {
			this.createdDate = createdDate;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public List<Item> getItemList() {
			return itemList;
		}

		public void setItemList(List<Item> itemList) {
			this.itemList = itemList;
		}
		
		
	

}
