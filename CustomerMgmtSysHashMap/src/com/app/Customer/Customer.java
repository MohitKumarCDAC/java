package com.app.Customer;

import java.io.Serializable;
import java.time.LocalDate;

import com.app.Customer.*;

public class Customer implements Serializable{
	private int CustomerId;
	private static int count=1;//its use of id auto increment
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	private double regisAmount;
	private LocalDate dob;
	private ServicePlan plan;
	
	public Customer(String FirstName,String LastName,String Email,String password,
			double regiAmount,LocalDate dob,ServicePlan plan) 
	{
		this.CustomerId=count++;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Email=Email;
		this.Password=password;
		this.regisAmount=regiAmount;
		this.dob=dob;
		this.plan=plan;
		
	}
	//constructor for Email that makes primary key
	public Customer(String Email) {
		this.Email=Email;
	}
	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email="
				+ Email + ", Password=" + Password + ", regisAmount=" + regisAmount + ", dob=" + dob + ", plan=" + plan
				+ "]";
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public double getRegisAmount() {
		return regisAmount;
	}
	public void setRegisAmount(double regisAmount) {
		this.regisAmount = regisAmount;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public ServicePlan getPlan() {
		return plan;
	}
	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}
	
	
	
}
