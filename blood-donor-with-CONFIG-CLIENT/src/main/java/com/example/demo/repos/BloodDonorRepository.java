package com.example.demo.repos;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BloodDonor;

@Repository
public interface BloodDonorRepository extends JpaRepository<BloodDonor, Long> {
	
	public List<BloodDonor> findByBloodGroup(String srchGroup);
	
	public List<BloodDonor> findByFirstName(String srchName);
	
	//here abd_blood_donor refers the table and not java class
	//blood group and date last donated refer to column and not the fields in java class
	@Query(value="select *from abd_blood_donor where bloodgroup=:group and datelastdonated=:date",nativeQuery = true)
	public List<BloodDonor> srchByGroupAndDate(@Param("group")String bloodGroup,@Param("date")LocalDate date);
	
	//using JPQL
	@Query(value ="update BloodDonor set dateLastDonated=:date where mobileNumber=:phoneNumber",nativeQuery = false)
	@Modifying
	@Transactional
	public int updateLastDonated(@Param("date") LocalDate date,@Param("phoneNumber")long phoneNumber);
}
