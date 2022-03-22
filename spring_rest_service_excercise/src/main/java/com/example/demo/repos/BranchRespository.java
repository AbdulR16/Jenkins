package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Branch;

public interface BranchRespository extends JpaRepository<Branch, Integer> {

}
