package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static utils.ValidationRules.*;
import utils.*;

import Watch.Brand;
import Watch.BrandMaterialType;
import Watch.CategoryType;
import Watch.ShapeType;
import Watch.StyleType;
import Watch.Watch;
import exception.WatchException;

public class utils {
	public static Scanner sc=new Scanner(System.in);
	public static void addwatch(List<Watch>watchlist)throws WatchException
	{
		System.out.println("Enter Watch Category(MEN, WOMEN, CHILD, TEEN, UNISEX):");
		CategoryType category=validatecategory(sc.next());
		
		System.out.println("Enter Brand Name(FASTRACK,TITAN,ROLEX)");
		Brand brand=validateBrand(sc.next());
		
		System.out.println("Enter Watch Shape Type(SQUARE, RECTANGLE, ROUND,OVAL):");
		ShapeType shape=validateShape(sc.next());
		
		System.out.println("Enter Style Type(CASUAL, SPORT, WEDDING,FORMAL,SPORTY,DRESSY)");
		StyleType style=validatestyle(sc.next());
		
		System.out.println("Enter Material Type(CERAMIC, STEEL, SILVER, LEATHER, STAINLESS_STEEL, GOLD_PLATED, RUBBER, RESIN):");
		BrandMaterialType material=validateMaterial(sc.next());

		System.out.println("Enter ID of Watch:");
		int ID=sc.nextInt();
		
		System.out.println("Enter Stock Size:");
		int stock=validatestock(sc.nextInt());
		
		System.out.println("Enter Price:");
		double price=sc.nextDouble();
		
		System.out.println("Enter Discount:");
		double discount=sc.nextDouble();
		
		System.out.println("Stock listing date:");
		LocalDate date=validateDate(sc.next());
		
		watchlist.add(new Watch(ID, brand, material, category, shape, style, stock, price, discount, date, date));
			
	}
	
	public static void displayWatchlist(List<Watch>watList)
	{
		watList.forEach(s->System.out.println(s));
	}
	public static void updateStock(List<Watch>list)throws WatchException
	{
		//take Watch id from student and search from list
		System.out.println("Enter Watch ID:");
		int watchID=sc.nextInt();
		//here we use indexOf to search the record from list (call the constructor of id)
		int index=list.indexOf(new Watch(watchID));
		if(index== -1)//if it is true
		{
			throw new WatchException("id not found!!!");
		}
		System.out.println("Enter new Record:");
		//set the value of new stock
		list.get(index).setStock(validatestock(sc.nextInt()));
		//and set current date
		list.get(index).setStockUpdateDate(LocalDate.now());
		
	}
	public static void setDiscount(List<Watch>list)throws WatchException
	{
		//take discount on all the watches
		/*This code snippet applies a 10% discount to watches in a list that are older than 1 year. */
		list.stream().filter(d->d.getStocklistingDate().plusYears(1).isBefore(LocalDate.now()))
		.forEach(d->d.setDiscount(10));
		System.out.println("Discount set 10% ");
	}
	public static void removeWatch(List<Watch>list)throws WatchException
	{
		/*
		 * The code you provided removes watches from a list (list) that
		 *  haven't had their stock updated in over 18 months. 
		 *  Here's a breakdown of what each part does:*/
		
		List<Watch>removelist=new ArrayList<Watch>();
		list.stream().filter(r->r.getStockUpdateDate().minusMonths(18).isBefore(r.getStocklistingDate()))
		.forEach(r->{System.out.println(r);
		removelist.add(r);
		});
		removelist.forEach(s->list.remove(s));
		System.out.println("Watch removed:");

	}
	
	public static void populatelist(List<Watch>watchlist)
	{
		watchlist.add(new Watch(101, Brand.FASTRACK, BrandMaterialType.CERAMIC,CategoryType.
				MEN,ShapeType.OVAL, StyleType.FORMAL,10 , 1900, 10.0, LocalDate.parse("2021-10-10"),LocalDate.parse("2024-02-04")));
		watchlist.add(new Watch(102, Brand.ROLEX, BrandMaterialType.LEATHER,CategoryType.TEEN
				,ShapeType.RECTANGLE, StyleType.SPORT,11 , 19000, 10.0, LocalDate.parse("2020-10-10"),LocalDate.parse("2024-01-04")));
		watchlist.add(new Watch(108, Brand.TITAN, BrandMaterialType.RESIN,CategoryType.UNISEX
					,ShapeType.SQUARE, StyleType.WEDDING,14 , 2900, 10.0, LocalDate.parse("2022-10-10"),LocalDate.parse("2024-03-04")));
		watchlist.add(new Watch(103, Brand.FASTRACK, BrandMaterialType.CERAMIC,CategoryType.
				MEN,ShapeType.OVAL, StyleType.FORMAL,10 , 1900, 10.0, LocalDate.parse("2021-10-10"),LocalDate.parse("2024-02-04")));
		watchlist.add(new Watch(104, Brand.FASTRACK, BrandMaterialType.CERAMIC,CategoryType.
				MEN,ShapeType.OVAL, StyleType.FORMAL,10 , 1900, 10.0, LocalDate.parse("2021-10-10"),LocalDate.parse("2024-02-04")));
		watchlist.add(new Watch(105, Brand.FASTRACK, BrandMaterialType.CERAMIC,CategoryType.
				MEN,ShapeType.OVAL, StyleType.FORMAL,10 , 1900, 10.0, LocalDate.parse("2021-10-10"),LocalDate.parse("2024-02-04")));
	}
	

}
