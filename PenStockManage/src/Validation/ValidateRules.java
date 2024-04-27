package Validation;

import java.time.LocalDate;

import com.app.PenStock.Brand;
import com.app.PenStock.InkColor;
import com.app.PenStock.Material;

import exception.PenException;

public class ValidateRules {
	
	//return type its enum class name
	public static Brand validateBrand(String brand)
	{
		return Brand.valueOf(brand.toUpperCase());
	}
	
	public static Material validateMaterial(String material)
	{
		return Material.valueOf(material.toUpperCase());
	}
	
	public static InkColor validateInkColor(String inkcolor)
	{
		return InkColor.valueOf(inkcolor.toUpperCase());
	}
	
	public static int validateStock(int stock)throws PenException
	{
		if(stock>0)
		{
			return stock;
		}
		throw new PenException("Not in stock!try next Time:");
	}
	public static LocalDate validateDate(String dob)
	{
		return LocalDate.parse(dob);
	}
	
	
}
