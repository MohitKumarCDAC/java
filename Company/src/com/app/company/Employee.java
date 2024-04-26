package com.app.company;

import java.time.LocalDate;

public class Employee {
	//Name, Date of joining, Phone Number, Aadhaar number
	private static int count=1;
	private int Emp_id;
	private String name;
	private LocalDate dateOfjoining;
	private String phoneNumber;
	private String Aadharnumber;
	public Employee(String name, LocalDate dateOfjoining, String phoneNumber, String aadharnumber) {
		super();
		this.Emp_id=count++;
		this.name = name;
		this.dateOfjoining = dateOfjoining;
		this.phoneNumber = phoneNumber;
		Aadharnumber = aadharnumber;
	}
	public Employee(String Aadharnumber)
	{
		this.Aadharnumber=Aadharnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfjoining() {
		return dateOfjoining;
	}
	public void setDateOfjoining(LocalDate dateOfjoining) {
		this.dateOfjoining = dateOfjoining;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAadharnumber() {
		return Aadharnumber;
	}
	public void setAadharnumber(String aadharnumber) {
		Aadharnumber = aadharnumber;
	}
	
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	@Override
	public String toString() {
		return "Employee [Emp_id=" + Emp_id + ", name=" + name + ", dateOfjoining=" + dateOfjoining + ", phoneNumber="
				+ phoneNumber + ", Aadharnumber=" + Aadharnumber + "]";
	}
	public boolean equals(Object o)
	{
		if(o instanceof Employee)
		{
			Employee other=(Employee)o;
			return this.getAadharnumber().equals(other.getAadharnumber());
		}
		return false;
	}
	

}
