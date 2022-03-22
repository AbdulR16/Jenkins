package com.example.demo.repos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByStudentName(String srchName); 
	
	@Query(value="update abd_excel_student set markscored=:updatedMark where rollnumber=:number",nativeQuery=true)
	@Modifying
	@Transactional
	public int updateMark(@Param("number")int rollNumber,@Param("updatedMark")double updatedMark);
	
}
