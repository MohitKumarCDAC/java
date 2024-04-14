package com.app.customer;

import java.time.LocalDate;

import Exception_Customer.CustomerException;

public class Customer {
	private int CustomerId;
	private static int count=1;//its use of id auto increment
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	private double regisAmount;
	private LocalDate dob;
	private ServicePlan plan;
	
	
//	public Customer(String email, String password) {
//		super();
//		Email = email;
//		Password = password;
//	}
	public Customer(String email) {
		super();
		Email = email;
		
	}

	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}



public Customer(String FirstName,String LastName,String Email,String Password,double regisAmount,LocalDate dob,ServicePlan plan) 
{
		//parametrize constructor
		super();
		this.CustomerId=count++;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Email=Email;
		this.Password=Password;
		this.regisAmount=regisAmount;
		this.dob=dob;
		this.plan=plan;
		
	}

	@Override
	public String toString() {
		return "StudentApp [id=" +CustomerId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", Password=" + Password + ", regisAmount=" + regisAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
//	@Override
//	public boolean equals(Object o)
//	{
//		if(o instanceof Customer) {
//			Customer c=(Customer)o;
//		return ((this.Email.equals(c.Email))&&(this.Password.equals(c.Password)));
//		}
//		return false;
//	}
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Customer) {
			Customer others=(Customer)o;
		return (this.Email.equals(others.Email));
		}
		return false;
	}
	

}

