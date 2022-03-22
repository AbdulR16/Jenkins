package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="abd_loan")
public class Loan {
	
	@Id
	@Column(name="applicationnumber")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int applicationNumber;
	
	@Column(name="applicationname")
	private String applicationName;
	
	
	@Column(name="applicationdate")
	@DateTimeFormat(iso = ISO.DATE)
	private Date applicationDate;
	
	@Column(name="loanamount")
	private double loanAmount;
	
	@Column(name="typepfloan")
	private String typeOfLoan;

}
