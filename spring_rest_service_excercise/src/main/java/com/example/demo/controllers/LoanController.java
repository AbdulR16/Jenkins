package com.example.demo.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.model.Loan;

import com.example.demo.service.LoanService;

@RestController
@RequestMapping(path="/api")
public class LoanController {
	
	@Autowired
	private LoanService service;
	
	@PostMapping(path="/loans")
	@RolesAllowed( {"ROLE_ADMIN"})
	public ResponseEntity <Loan> addApplicants(@RequestBody Loan entity){
		
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{applicationnumber}")
				.buildAndExpand(entity)
				.toUri();

				Loan addedEntity = this.service.add(entity);
				
					return ResponseEntity.created(uri).body(addedEntity);

	}
	
	@GetMapping(path="/loans") //Mapping Name should be Class name in plural form
	@RolesAllowed( {"ROLE_ADMIN","ROLE_GUEST"})
	public List<Loan> findAll() {
		
		
		return service.getAll();
	}
	
	@DeleteMapping(path="/loans/delete/{applicationnumber}")
	public  ResponseEntity<String> deleteLoanById(@PathVariable("applicationnumber") int id) {
		
		Optional<Object> delete = this.service.deleteById(id);
		
		String message = delete +"Row Deleted";
		
		return ResponseEntity.status(HttpStatus.OK).body(message);
	}
	@PutMapping ("/loans")
	public ResponseEntity<Loan> UpadteStudent(@RequestBody Loan loan) {
		
		Loan updated = this.service.updateStudent(loan);
		
		return ResponseEntity.status(HttpStatus.OK).body(updated);
	}
	

}
