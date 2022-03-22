package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table (name= "abd2_emp")
public class Employee {
	
	@Id
	@Column(name="EMPNO")
	int emp_no;

	@Column(name="ENAME")
	String emp_name;

	@Column(name="JOB")
	String job;

	@Column(name="SAL")
	int salary;

	@Column(name="DEPTNO")
	int dept_no;
}
