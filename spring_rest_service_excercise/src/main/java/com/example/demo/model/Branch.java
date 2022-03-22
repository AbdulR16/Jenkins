package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


import lombok.Data;

@Entity
@Table(name="abd_branch")
@Data
@Component
public class Branch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="branchcode")
	private int branchCode;
	
	@Column(name="branchname")
	private String branchName;
	
	@OneToMany(targetEntity = Loan.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="loan_ref",referencedColumnName = "branchcode")
	List<Loan> loanList;
}
