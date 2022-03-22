package com.example.demo.entity;

public class Doctor {
	
	private int doctorId;
	private String doctorName;
	private long handPhone;
	private String email;
	private String specialisation;
	private String city;
	public Doctor() {
		super();
	}
	public Doctor(int doctorId, String doctorName, long handPhone, String email, String specialisation, String city) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
		this.email = email;
		this.specialisation = specialisation;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", handPhone=" + handPhone + ", email="
				+ email + ", specialisation=" + specialisation + ", city=" + city + "]";
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public long getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
