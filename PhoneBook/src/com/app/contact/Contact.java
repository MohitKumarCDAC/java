package com.app.contact;

import java.time.LocalDate;
import java.util.Objects;

public class Contact {

	private String phoneNumber;
	private String name;
	private LocalDate date;
	private String Email;
	
	
	public Contact(String phoneNumber, String name, LocalDate date, String email) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.date = date;
		Email = email;
	}
	
	public Contact(String name) {
		this.name=name;
	}
	
	public Contact(LocalDate date)
	{
		this.date=date;
	}
	public Contact(String name,LocalDate date)
	{
		this.name=name;
		this.date=date;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	

	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", name=" + name + ", date=" + date + ", Email=" + Email + "]";
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Contact)
		{
			Contact other=(Contact)o;
			return this.getName().equals(other.getName()) && this.getDate().equals(other.getDate());
		}
		return false;
	}
	 @Override
	    public int hashCode() {
	        return Objects.hash(getName(), getDate());
	    }
	
}
