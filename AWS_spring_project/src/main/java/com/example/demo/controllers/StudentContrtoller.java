package com.example.demo.controllers;


import java.net.URI;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.model.Student;
import com.example.demo.services.StudentService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path="/api/v1")
@Slf4j
public class StudentContrtoller {
	
	
	
	@Autowired
	private StudentService service;
	

	
//	@GetMapping(path="/students") //Mapping Name should be Class name in plural form
//	public Student getStudent() {
//		
//		return student;
//	}
	
	@GetMapping(path="/students/{id}")
	public Student getStudentById(@PathVariable("id") int rollNumber) {
	
//	if(rollNumber<100) {
//		
//		return student;
//	}else {
//		
//		return anotherStudent;
//	}
		return this.service.searchById(rollNumber).orElseThrow(()-> new IdNotFoundExeption("Element with"+ rollNumber+"Not Found"));
		
}
//	@GetMapping(path="/students/{branch}/{id}")
//	public Student getStudentById(@PathVariable("id") int rollNumber,@PathVariable("branch") String branch) {
//	
//	if(rollNumber<100) {
//		
//		return student;
//	}else {
//		
//		return anotherStudent;
//	}
//
//}
	//@PostMapping ("/students")
	// public Student addStudent(@RequestBody Student student) {
	// return student;
	// }

	// sending the newly created resource with status code 201 using ResponseEntity
//	@PostMapping ("/students")
//	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
//	return ResponseEntity.status(201).body(student);
//	}
	
	@PostMapping(path="/students")
 
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {

	URI uri = ServletUriComponentsBuilder
	.fromCurrentRequest()
	.path("/{id}")
	.buildAndExpand(student.getRollNumber())
	.toUri();

	Student addedEntity = this.service.add(student);
	
		return ResponseEntity.created(uri).body(addedEntity);

	}
	
	@GetMapping(path="/students") //Mapping Name should be Class name in plural form
	public List<Student> findAll() {
		
		
		//log.warn("====error");
		log.info("====info Message");
		log.trace("***trace" );
	

		return service.findAll();
	}
	
	@GetMapping(path="/students/srch/{name}")
	public List<Student> getStudentByName(@PathVariable String name) {
	
//	if(rollNumber<100) {
//		
//		return student;
//	}else {
//		
//		return anotherStudent;
//	}
		return this.service.findByName(name);
	}
	
	@DeleteMapping(path="/students")
	public ResponseEntity<Student> removeStudent(@RequestBody Student entity){
		
		Student deleted = this.service.remove(entity)
							.orElseThrow(()-> new RuntimeException("Element with"+ entity.getRollNumber()+"Not Found"));
		
		return ResponseEntity.status(200).body(deleted);
	}
	@DeleteMapping(path="/students/delete/{id}")
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public void removeStudentById(@PathVariable("id") int id) {
		
		this.service.removeById(id).orElseThrow(()-> new RuntimeException("Element with"+ id+"Not Found"));
	}
	@PutMapping ("/students")
	public ResponseEntity<Student> UpadteStudent(@RequestBody Student student) {
		
		Student updated = this.service.updateStudent(student);
		
		return ResponseEntity.status(HttpStatus.OK).body(updated);
	}
	@PatchMapping(path="/student/update/{rollnumber}/{latestmark}")
	public ResponseEntity<String> updateMark(@PathVariable int rollnumber,@PathVariable double latestmark){
		
		int updated = this.service.updatedMark(rollnumber,latestmark);
		
		String message= updated +"Row Updated";
		return ResponseEntity.status(HttpStatus.OK).body(message);
	}
	
	@GetMapping(path="/students/sort")
	public List<Student> getSortedStudentList(@RequestParam String propName){
		
		return this.service.sortByProperty(propName);
	}
	
	@GetMapping(path="/students/pageable/{pageNum}/{size}")
	public List<Student> getStudentPaged(@PathVariable int pageNum,@PathVariable int size){
		
		return this.service.findByPage(pageNum,size);
	}
	
	
}