package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="abd_excel_student")
public class Student {
	@Id
	@Column(name="rollnumber")
	private int rollNumber;
	
	@Column(name="studentname")
	private String studentName;
	
	@Column(name="markscored")
	private String markScored;

}
