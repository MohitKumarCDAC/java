package utils;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import ItemException.ItemException;
import com.store.app.Items;

public class utils {
	public static Scanner sc=new Scanner(System.in);
	
	public static LocalDate validateDate(String date)
	{
		return LocalDate.parse(date);
	}
	
	public static void additems(List<Items>list)throws ItemException
	{
		System.out.println("Enter Item Code");
		String itemcode=sc.next();
		validateItem(list, itemcode);
		
		System.out.println("Enter Description:");
		sc.nextLine();
		String Desc=sc.nextLine();
		
		System.out.println("Enter Price:");
		double price=sc.nextDouble();
		
		System.out.println("Enter Shipment Date: ");
		String date=sc.next();
		validateDate(date);
		
		//add in list
		list.add(new Items(itemcode, Desc, price, LocalDate.parse(date)));
		System.out.println("item stored!");
	}
	public static void displayItem(List<Items>list)
	{
		list.forEach(i->System.out.println(i));
	}
	
	public static void validateItem(List<Items>list,String itemcode)throws ItemException
	{
		Items itm=new Items(itemcode);
		if(list.contains(itm))
		{
			throw new ItemException("Allready Exits:pls enter new Value");
		}
	}
	public static void populateData(List<Items>list)
	{
		list.add(new Items("b203","Biscuite", 10, LocalDate.parse("2024-03-23")));
		list.add(new Items("a204","Chocklet", 50, LocalDate.parse("2023-09-23")));
		list.add(new Items("e205","KurKure", 90, LocalDate.parse("2022-02-24")));
		list.add(new Items("z206","Maggi", 110, LocalDate.parse("2024-04-23")));
		list.add(new Items("c207","corn", 20, LocalDate.parse("2024-01-23")));
		
	}

}
