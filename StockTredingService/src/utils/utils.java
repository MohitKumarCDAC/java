package utils;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.app.stock.Stock;

import StockException.ExceptionStock;

import static utils.validationRule.*;

public class utils {

	private static Scanner sc=new Scanner(System.in);
	public static void addStock(List<Stock>slist)throws ExceptionStock
	{
		System.out.println("Enter Stock ID:");
		String id=sc.next();
		validateId(slist, id);
		
		System.out.println("Enter Stock Name:");
		String StockName=sc.next();
		
		System.out.println("Enter Company Name:");
		String CompanyName=sc.next();
		
		System.out.println("Enter Price:");
		double price=sc.nextDouble();
		
		System.out.println("Enter Closing Date:");
		LocalDate date=LocalDate.parse(sc.next());
		validateClosingDate(slist, date);
		
		System.out.println("Enter Quantity:");
		int quantity=sc.nextInt();
		
		slist.add(new Stock(id, StockName, CompanyName, price, date, quantity));
		System.out.println("Data Add in the list");
	}
	//display all
	public static void displayStock(List<Stock>slist)
	{
		slist.forEach(i->System.out.println(i));
	}
	//display by name
	public static void displayBycompanyname(List<Stock>slist)
	{
		System.out.println("Enter Company Name:");
		String CompanyName=sc.next();
		slist.stream().filter(i->i.getCompanyName().equals(CompanyName))
		.forEach(i->System.out.println(i));
		
	}
	//purchase product
	public static void purchaseProduct(List<Stock>slist)throws ExceptionStock
	{
		System.out.println("Enter Stock ID");
		String id=sc.next();
		int index=slist.indexOf(new Stock(id));
		if(index ==-1)
		{
			throw new ExceptionStock("Id mismatch pls take correct id");
		}
		System.out.println("Enter product Quantity:");
		int quantity=sc.nextInt();
		if(slist.get(index).getQuantity() < quantity)
		{
			slist.get(index).setQuantity(slist.get(index).getQuantity()+quantity);
			System.out.println("stock Updated............");
		}
		else
		{
		throw new ExceptionStock(" available quantity");	
		}
	}
	//sell product
	public static void sellProduct(List<Stock>slist)throws ExceptionStock
	{
		System.out.println("Enter Stock ID");
		String id=sc.next();
		int index=slist.indexOf(new Stock(id));
		if(index ==-1)
		{
			throw new ExceptionStock("Id mismatch pls take correct id");
		}
		System.out.println("Enter product Quantity:");
		int quantity=sc.nextInt();
		if(slist.get(index).getQuantity() > quantity)
		{
			slist.get(index).setQuantity(slist.get(index).getQuantity()-quantity);
			System.out.println("product sell.........and.... update Quantity");
		}
		else {
		throw new ExceptionStock("insufficient available quantity");
		}
	}
	
	//populate data
	public static void populateList(List<Stock>slist)
	{
		slist.add(new Stock("m123", "momo", "mongonis", 150, LocalDate.parse("2024-10-10"), 12));
		slist.add(new Stock("a053", "mixture", "haldiram", 250, LocalDate.parse("2025-02-10"), 10));
		slist.add(new Stock("b129", "maggi", "nestle", 50, LocalDate.parse("2024-08-10"), 19));
		slist.add(new Stock("c383", "cake", "cakeplace", 90, LocalDate.parse("2024-06-10"), 9));
		slist.add(new Stock("x128", "biscuite", "anmol", 80, LocalDate.parse("2026-10-10"), 20));
	}
}
