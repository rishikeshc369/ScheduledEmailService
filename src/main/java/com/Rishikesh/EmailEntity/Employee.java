package com.Rishikesh.EmailEntity;

public class Employee {

	private int id;
	private String name;
	private String email;
	private String dob; // Format: YYYY-MM-DD

	public Employee(int id, String name, String email, String dob) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
}
