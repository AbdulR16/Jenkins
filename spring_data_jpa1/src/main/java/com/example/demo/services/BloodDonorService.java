package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.BloodDonor;
import com.example.demo.repos.BloodDonorRepository;

@Service
public class BloodDonorService {
	
	private BloodDonorRepository repo;

	public BloodDonorService(BloodDonorRepository repo) {
		super();
		this.repo = repo;
		
		System.out.println(this.repo.getClass().getName());
	}
	
	public BloodDonor add(BloodDonor donor) {
		
		return this.repo.save(donor);
	}
	
	public List<BloodDonor> findAll(){
		
		return this.repo.findAll();
	}
	
	public void delete(long id) {
		
		this.repo.deleteById(id);
	}
	
	public BloodDonor update(BloodDonor donor) {
		return this.repo.save(donor);
		}
	
	public List<BloodDonor> findByFirstName(String srchname){
		
		return this.repo.findByFirstName(srchname);
	}
	
//	public List<BloodDonor> findByGroup(String group){
//		
//		return this.repo.srchByGroup(group);
//	}
	
	public int updateLastDonated(LocalDate date,long mobileNumber) {
		
		return this.repo.updateLastDonated(date, mobileNumber);
	}

}
