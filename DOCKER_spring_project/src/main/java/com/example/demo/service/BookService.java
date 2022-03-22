package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	public String suggestBestBook(String topic) {
		
		String response ="FaceBook";
		
		if(topic.equalsIgnoreCase("java")) {
			
			response = "Head First Java";
		}
		return response;
	}

}
