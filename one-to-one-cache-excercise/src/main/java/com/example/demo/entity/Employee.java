package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="abd_employee_2022")
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
	
	@Id
	@Column(name="empid")
	private int empId;
	
	@Column(name="employeename")
	private String employeeName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="licence_ref")
	private Licence licence;

}
