package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="abd_milk_2022")
@PrimaryKeyJoinColumn(name="product_ref")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Milk extends Product {
	
	public Milk(int productId, String productName, double ratePerUnit, String type, String shelfLife) {
		super(productId, productName, ratePerUnit);
		this.type = type;
		this.shelfLife = shelfLife;
	}
	
	@Column(name = "type")
	private String type;
	
	@Column(name="shelflife")
	private String shelfLife;
	

}
