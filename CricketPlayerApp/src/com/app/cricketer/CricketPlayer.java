package com.app.cricketer;

import java.io.Serializable;

public class CricketPlayer implements Serializable {
//String name,int age,String email_id,String Phone,int rating
	//data members
	private String name;
	private int age;
	private String Email_Id;
	private String phone;
	private int rating;
	
	//constructor
	
	public CricketPlayer(String name, int age, String email_Id, String phone, int rating) {
		super();
		this.name = name;
		this.age = age;
		Email_Id = email_Id;
		this.phone = phone;
		this.rating = rating;
	}
//	public CricketPlayer(String name)
//	{
//		this.name=name;
//	}
	public CricketPlayer(String Email_ID)
	{
		this.Email_Id=Email_ID;
	}

	@Override
	public String toString() {
		return "CricketPlayer [name=" + name + ", age=" + age + ", Email_Id=" + Email_Id + ", phone=" + phone
				+ ", rating=" + rating + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail_Id() {
		return Email_Id;
	}

	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
//	public boolean equals(Object o)
//	{
//		if(o instanceof CricketPlayer)
//		{
//			CricketPlayer other=(CricketPlayer)o;
//			return this.getName().equals(other.getName());
//		}
//		return false;
//	}
	public boolean equals(Object o)
	{
		if(o instanceof CricketPlayer)
		{
			CricketPlayer other=(CricketPlayer)o;
			return this.getEmail_Id().equals(other.getEmail_Id());
		}
		return false;
	}
}
