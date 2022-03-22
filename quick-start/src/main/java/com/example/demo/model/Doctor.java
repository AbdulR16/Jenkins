package com.example.demo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Doctor {
	
	int doctorId;     //these Three are simple values 
	String doctorName;
	String location;
	
	//Collaborating Object ie; joining doctor and patient or workig together
	Patient patient; // reference to other class
	
	

}
