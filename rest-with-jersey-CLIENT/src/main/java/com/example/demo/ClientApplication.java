package com.example.demo;



import com.example.demo.model.Book;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ClientApplication {
	
	public static void makeGetRequest() {
		
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:4040/rest").path("/books");
		
		Invocation.Builder bulider = target.request(MediaType.APPLICATION_JSON);
		
		Response response = bulider.get();
		
		System.out.println(response.readEntity(String.class));
		
		
	}
	
	public static void makePostRequest() {
		
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:4040/rest").path("/books");
		
		Invocation.Builder bulider = target.request(MediaType.APPLICATION_JSON);
		
		String bookRef = "{\"id\":190,\"bookName\":\"microservice\",\"author\":\"ruban\",\"price\":\670}";
		
		//Book bookRef = new Book(201,"Spring in action",575.00,"guru");
		
		Response response = bulider.post(Entity.entity(bookRef, MediaType.APPLICATION_JSON));
		
		System.out.println(response.readEntity(String.class));
		
		
	}

	public static void main(String[] args) {
		
		makePostRequest();
		
		//makeGetRequest();
	}

}
