package com.app.stack;

import java.util.Scanner;

public class Customer {
	Scanner sc=new Scanner(System.in);
	private int id;
	private String name; 
	private String address;
	
	public Customer()
	{
		System.out.println("Enter id of customer:");
		id=sc.nextInt();
		System.out.println("Enter name of customer:");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter Address of customer:");
		address=sc.nextLine();
	}
	public String toString()
	{
		return ("ID:"+id+"::"+"Name:"+name+"::"+"Address:"+address);
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
