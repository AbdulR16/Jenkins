package com.example.demo.entity;

import java.time.LocalDate;

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
@Table(name = "abdul_doctor1")
public class Doctor {
	
	@Id
	@Column(name="doctorid")
	long doctorId;
	
	@Column(name ="doctorname")
	String doctorName;
	
	@Column(name = "handphone")
	long handPhone;
	
	@Column(name = "email")
	String email;
	
	@Column(name ="specialisation")
	String specialisation;
	
	@Column(name = "city")
	String city;
	


}
