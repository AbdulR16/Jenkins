package com.example.demo.entity;

import java.time.LocalDate;

import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


@Component
public class BloodDonor {
	

	
	long mobileNumber;
	
	@Length(min=3,max=8,message="First Name should be 3 to 8 character")
	String firstName;
	

	String bloodGroup;
	
	@DateTimeFormat(iso=ISO.DATE)
	@PastOrPresent(message="Donation Date should be Earlier or todays date")
	LocalDate dateLastDonated;

}
