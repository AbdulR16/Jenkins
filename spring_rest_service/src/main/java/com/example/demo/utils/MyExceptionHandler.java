package com.example.demo.utils;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.controllers.IdNotFoundExeption;

@RestControllerAdvice
public class MyExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	public CustomExceptionHandler handleRunTimeException(Exception ex,WebRequest req) {
		
		return new CustomExceptionHandler(LocalDateTime.now(),ex.getMessage(),req.getDescription(false));
	}
	@ExceptionHandler(IdNotFoundExeption.class)
	public CustomExceptionHandler handleIdNotFoundException(Exception e, WebRequest req) {

	return new CustomExceptionHandler(LocalDateTime.now(),e.getMessage(),req.getDescription(false));
	}
}
 