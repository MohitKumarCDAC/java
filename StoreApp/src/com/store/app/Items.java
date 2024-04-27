package com.store.app;

import java.io.Serializable;
import java.time.LocalDate;

public class Items implements Serializable{

/*	Item Code ( String) : primary key
	Description : String
	Price : double
	Shipment Date : Date
*/	
	private String ItemCode;
	private String Description;
	private double price;
	private LocalDate date;
	
	public Items(String itemCode, String description, double price, LocalDate date) {
		super();
		ItemCode = itemCode;
		Description = description;
		this.price = price;
		this.date = date;
	}
	
	public Items(String ItemCode)
	{
		this.ItemCode=ItemCode;
	}

	@Override
	public String toString() {
		return "Items [ItemCode=" + ItemCode + ", Description=" + Description + ", price=" + price + ", date=" + date
				+ "]";
	}

	public String getItemCode() {
		return ItemCode;
	}

	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Items)
		{
			Items other=(Items)o;
			return this.getItemCode().equals(other.getItemCode());
		}
		return false;
	}
	
	
	
	
}
