package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="abd_excel_student")
public class Student {
	
	@Id
	@Column(name="rollnumber")
	private int rollNumber;
	
	@Column(name="studentname")
	private String studentName;
	
	@Column(name="markscored")
	private double markScored;
	
	

}
