package com.example.demo.utils;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomExceptionHandler {
	
	private LocalDateTime date;
	private String message;
	private String description;
	
	

}
