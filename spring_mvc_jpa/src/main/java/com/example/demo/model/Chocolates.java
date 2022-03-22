package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chocolates {
	
	@Id
	@Column(name="chocono")
	private int chocoNo;
	@Column(name="choconame")
	private String chocoName;
	
	public int getChocoNo() {
		return chocoNo;
	}
	public void setChocoNo(int chocoNo) {
		this.chocoNo = chocoNo;
	}
	public String getChocoName() {
		return chocoName;
	}
	public void setChocoName(String chocoName) {
		this.chocoName = chocoName;
	}
	
	@Override
	public String toString() {
		return "Chocolates [chocoNo=" + chocoNo + ", chocoName=" + chocoName + "]";
	}
	

}
