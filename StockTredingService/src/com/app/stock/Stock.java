package com.app.stock;
//stock id (unique : string), stock name (string), company name(string) , 
//price (double), closing date (Date) , quantity (int)

import java.io.Serializable;
import java.time.LocalDate;

public class Stock implements Serializable{
	private String id;
	private String Stockname;
	private String CompanyName;
	private double price;
	private LocalDate closingDate;
	private int Quantity;
	public Stock(String id, String stockname, String companyName, double price, LocalDate closingDate, int quantity) {
		super();
		this.id = id;
		Stockname = stockname;
		CompanyName = companyName;
		this.price = price;
		this.closingDate = closingDate;
		Quantity = quantity;
	}
	
	public Stock(String id)
	{
		this.id=id;
	}
	
	@Override
	public String toString() {
		return "Stock [id=" + id + ", Stockname=" + Stockname + ", CompanyName=" + CompanyName + ", price=" + price
				+ ", closingDate=" + closingDate + ", Quantity=" + Quantity + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStockname() {
		return Stockname;
	}
	public void setStockname(String stockname) {
		Stockname = stockname;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getClosingDate() {
		return closingDate;
	}
	public void setClosingDate(LocalDate closingDate) {
		this.closingDate = closingDate;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Stock)
		{
			Stock other=(Stock)o;
			return this.getId().equals(other.getId());
		}
		return false;
	}
}
