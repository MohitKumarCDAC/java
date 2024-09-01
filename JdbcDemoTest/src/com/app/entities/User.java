package com.app.entities;

import java.sql.Date;

//id | first_name | last_name | email  | password | 
 //dob        | status | role
public class User {
	private int userId;
	private String FirstName;
	private String LastName;
	private String email;
	private String password;
	private Date dob;
	private boolean status;
	private String role;
	
	//constructor
	public User(int userId, String firstName, String lastName, String email, String password, Date dob, boolean status,
			String role) {
		super();
		this.userId = userId;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}
	//apply a constructior for voter registration
	public User(String FirstName,String LastName,String email,String password,Date dob) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.email=email;
		this.password=password;
		this.dob=dob;
		this.role="voter";
	}
	public User(int userId,String firstName, String lastName, String email,boolean status, String role) {
		//fetch data
		super();
		this.userId = userId;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.status = status;
		this.role="voter";
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", email=" + email
				+ ", password=" + password + ", dob=" + dob + ", status=" + status + ", role=" + role + "]";
	}
	
	
	
	
}
