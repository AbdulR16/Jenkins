package com.example.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "abd_licence")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Licence implements Serializable{
	
	@Id
	@Column(name="licencenumber")
	private int licenceNumber;
	
	@Column(name="expirydate")
	//@DateTimeFormat(iso = ISO.DATE)
	private LocalDate expiryDate;
	
	@Column(name="rtonumber")
	private String rtoNumber;

}
