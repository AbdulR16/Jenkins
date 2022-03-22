package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;

import io.swagger.v3.oas.annotations.media.Schema;
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
	@Range(min=0,max=100,message="Mark Scored by the Student")
	@Schema(defaultValue="0",description="Mark Scored By Student no negative Mark",example="0 to 100")
	private double markScored;
	
	

}
