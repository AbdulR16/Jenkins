package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name="abd_product_2022")
public class Product {
	
	@Id
	@Column( name="productid")
	private int productId;
	@Column(name="productname")
	private String productName;
	
	@Column(name="rateperunit")
	private double ratePerUnit;

}
