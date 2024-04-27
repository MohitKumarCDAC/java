package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static Validation.ValidateRules.*;

import com.app.PenStock.Brand;
import com.app.PenStock.InkColor;
import com.app.PenStock.Material;
import com.app.PenStock.Pen;

import exception.PenException;

public class utils {
	public static Scanner sc=new Scanner(System.in);
	public static void addpen(List<Pen>penlist)
	{
		System.out.println("Enter Brand Name(CELLO, PARKER, REYONLDS,PENTONIC):");
		Brand brand=validateBrand(sc.next());
		
		System.out.println("Enter Material Type(PLASTIC, ALLOY ,STEEL, METAL)");
		Material material=validateMaterial(sc.next());
		
		System.out.println("Enter InkColor(BLACK,RED,BLUE)");
		InkColor inkcolor=validateInkColor(sc.next());
		
		 System.out.println("Enter Body Color:");
		 String color=sc.next();
		 
		 System.out.println("Enter Price:");
		 int price=sc.nextInt();
		 
//		 System.out.println("Enter Discount of pen:");
//			double discount=sc.nextInt();
		 
		 System.out.println("Enter StocListingDate:");
		LocalDate date=validateDate(sc.next());
		
		penlist.add(new Pen(brand, color, inkcolor, material, price,LocalDate.now(),date, price, 0.0));
			
	}
	
	//display records
	public static void displayrecord(List<Pen>listpen)
	{
		listpen.forEach(i->System.out.println(i));
	}
	public static void stockUpdate(List<Pen>penlist)throws PenException
	{
		/* Update stock of aPen
			i/p : brand | material | color | Ink color and new quantity*/
		System.out.println("Enter Brand Name");
		Brand brand=validateBrand(sc.next());
		System.out.println("Enter Material:");
		Material material=validateMaterial(sc.next());
		System.out.println("Enter Color");
		String color=sc.next();
		System.out.println("Enter Ink color:");
		InkColor inkcolor=validateInkColor(sc.next());
		for(Pen p :penlist)
		{
			if(p.getBrand().equals(brand)&&p.getMaterial().equals(material)&&p.getColor().equals(color)&&p.getInkColor().equals(inkcolor))
			{
				System.out.println("Enter new stock");
				//int stock=sc.nextInt();
				p.setStock(sc.nextInt());
				p.setStockUpdateDate(LocalDate.now());
			}
		}
		
	}
	/*Set discount of 20% for all the pens which are not at all sold in last 3 months
	In this you can set the discount value for all such pens OR apply discount n update price as well*/
		public static void giveDiscount(List<Pen>penlist)
		{
			penlist.stream().filter(p->p.getStockListingDate().plusMonths(3).isBefore(LocalDate.now()))
			.forEach(p->p.setDiscount(10.0));
			System.out.println("Discount set 10%");
		}
		public static void removepen(List<Pen>penlist)
		{
			List<Pen>removelist=new ArrayList<Pen>();
			penlist.stream().filter(p->p.getStockListingDate().plusMonths(9).isBefore(LocalDate.now()))
			.forEach(p->{System.out.println(p);
			removelist.add(p);
			});
			removelist.forEach(p->penlist.remove(p));
			System.out.println("Pen Removed");
		}
	
	public static void populatedList(List<Pen>penlist)
	{
		penlist.add(new Pen(Brand.CELLO, "red", InkColor.BLACK, Material.ALLOY, 10, LocalDate.parse("2024-03-10"), LocalDate.parse("2023-10-10"), 10, 0.0));
		penlist.add(new Pen(Brand.PARKER, "red", InkColor.BLUE, Material.METAL, 10, LocalDate.parse("2024-02-10"), LocalDate.parse("2022-10-10"), 20, 0.0));
		penlist.add(new Pen(Brand.CELLO, "red", InkColor.BLACK, Material.ALLOY, 19, LocalDate.parse("2024-03-10"), LocalDate.parse("2023-10-10"), 30, 0.0));
		penlist.add(new Pen(Brand.PENTONIC, "red", InkColor.BLACK, Material.ALLOY, 11, LocalDate.parse("2024-03-10"), LocalDate.parse("2023-10-10"), 30, 0.0));
		penlist.add(new Pen(Brand.PARKER, "red", InkColor.BLACK, Material.ALLOY, 12, LocalDate.parse("2024-03-10"), LocalDate.parse("2023-10-10"), 20, 0.0));
		penlist.add(new Pen(Brand.PARKER, "skyBlue", InkColor.BLUE, Material.METAL, 10, LocalDate.parse("2024-02-10"), LocalDate.parse("2023-11-19"), 40, 0.0));
		penlist.add(new Pen(Brand.PENTONIC, "green", InkColor.BLUE, Material.STEEL, 20, LocalDate.parse("2024-01-10"), LocalDate.parse("2024-03-10"), 50, 0.0));
		
	}
	

}
