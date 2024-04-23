package utils;

import java.time.LocalDate;

import Watch.Brand;
import Watch.BrandMaterialType;
import Watch.CategoryType;
import Watch.ShapeType;
import Watch.StyleType;
import exception.*;

public class ValidationRules {
	
	public static CategoryType validatecategory(String category)
	{
		return CategoryType.valueOf(category.toUpperCase());
	}
	public static BrandMaterialType validateMaterial(String Material)
	{
		return BrandMaterialType.valueOf(Material.toUpperCase());
	}
	public static ShapeType validateShape(String shape)
	{
		return ShapeType.valueOf(shape.toUpperCase());
	}
	public static StyleType validatestyle(String style)
	{
		return StyleType.valueOf(style.toUpperCase());
	}
	public static Brand validateBrand(String brand)
	{
		return Brand.valueOf(brand.toUpperCase());
	}
	public static int validatestock(int stock)throws WatchException
	{
		if(stock>0)
		{
			return stock;
		}
		throw new WatchException("Not in Stock!Try Next Time:");
	}
	public static LocalDate validateDate(String date)throws WatchException
	{
		return LocalDate.parse(date);
	}
 

}
