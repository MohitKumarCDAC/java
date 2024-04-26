package com.app.company;

import java.time.LocalDate;

public class FTPemployee extends Employee {
	//monthly salary
	private double salary;

	public FTPemployee(String name, LocalDate date, String phoneNumber, String aadharnumber, double salary) {
		super(name, date, phoneNumber, aadharnumber);
		this.salary = salary;
	}


 public String toString()
 {
	 return super.toString()+":"+"Salary:"+salary;
 }
		
	

}
