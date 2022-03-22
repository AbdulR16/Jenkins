package com.example.demo.model;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.ToString;

@Component  // to register as a bean can also be done using method with @Bean annotation
@ToString

public class Hospital {
	
	List<Patient> patientList;
	
	@Autowired				// setter injection
	public Hospital(List<Patient> patientList) {
		super();
		this.patientList = patientList;
	}
	

}
