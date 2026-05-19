package com.java.core.HasA;

public class student {

	private String rollno;

	private String firstname;

	private String lastname;

	private String city;
	
	private accountsdetails details;

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public accountsdetails getDetails() {
		return details;
	}

	public void setDetails(accountsdetails details) {
		this.details = details;
	}

}
