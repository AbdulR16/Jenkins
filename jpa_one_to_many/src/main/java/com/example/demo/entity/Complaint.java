package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="abd_complaint")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Complaint {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	public Complaint(String description, String status) {
		super();
		this.description = description;
		this.status = status;
	}

	@Column(name="description")
	private String description;
	
	@Column(name="status")
	private String status;
	

}
