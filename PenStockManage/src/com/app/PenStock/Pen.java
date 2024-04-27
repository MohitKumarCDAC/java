package com.app.PenStock;
/*
 * ID (unique identifier for each Pen, should be generated automatically)
b.	Brand (Example:  Cello, Parker, Reynolds etc.)
c.	Color
d.	InkColor
e.	Material (Example: Plastic, Alloy Steel, Metal etc.)
f.	Stock (Available quantity)
g.	Stock Update Date (it changed every time when admin update stock or user order executed)
h.	Stock Listing Date (date on which product is added to site for sale)
i.	Price (in INR) 
j.	Discounts (in percentage)

 * */

import java.time.LocalDate;

public class Pen {
	private static int count=1;
	private int ID;
	private Brand brand;
	private String Color;
	private InkColor inkColor;
	private Material material;
	private int stock;
	private LocalDate stockUpdateDate;
	private LocalDate stockListingDate;
	private int price;
	private double discount;
	
	//parametrize constructor
	public Pen( Brand brand, String color, InkColor inkColor, Material material, int stock,
			LocalDate stockUpdateDate, LocalDate stockListingDate, int price, double discount) {
		super();
		this.ID=count++;
		this.brand = brand;
		Color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.stockUpdateDate = stockUpdateDate;
		this.stockListingDate = stockListingDate;
		this.price = price;
		this.discount = 0.0;
	}
	//construdtor brand
	public Pen(int ID)
	{
		this.ID=ID;
	}
	public Pen(Brand brand,Material material,String color,InkColor inkColor)
	{
		this.brand=brand;
		this.material=material;
		this.Color=color;
		this.inkColor=inkColor;
	
	}
	
	
	//override toString method
	@Override
	public String toString() {
		return "Pen [ID=" + ID + ", brand=" + brand + ", Color=" + Color + ", inkColor=" + inkColor + ", material="
				+ material + ", stock=" + stock + ", stockUpdateDate=" + stockUpdateDate + ", stockListingDate="
				+ stockListingDate + ", price=" + price + ", discount=" + discount + "]";
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Pen.count = count;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public InkColor getInkColor() {
		return inkColor;
	}
	public void setInkColor(InkColor inkColor) {
		this.inkColor = inkColor;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}
	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}
	public LocalDate getStockListingDate() {
		return stockListingDate;
	}
	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	
	
	

}
