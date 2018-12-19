package com.cg.babycare.bean;

public class BabyHealthCare 
{
	String babyId;
    String babyName;
    String babyAge;
    String babyGender;
    String fatherName;
    String motherName;
    String Address;
    String contact;
	
	public String getBabyName() {
		return babyName;
	}
	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}
	public String getBabyAge() {
		return babyAge;
	}
	public String getBabyId() {
		return babyId;
	}
	public void setBabyId(String babyId) {
		this.babyId = babyId;
	}
	public void setBabyAge(String babyAge) {
		
		this.babyAge = babyAge;
		 
	}
	public String getBabyGender() {
		return babyGender;
	}
	public void setBabyGender(String babyGender) {
		this.babyGender = babyGender;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "BabyHealthCare [babyId=" + babyId + ",  babyName=" + babyName
				+ ", babyAge=" + babyAge + ", babyGender=" + babyGender + ", fatherName=" + fatherName + ", motherName="
				+ motherName + ", Address=" + Address + ", contact=" + contact + "]";
	}
	
	
    

}
