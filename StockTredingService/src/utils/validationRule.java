package utils;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.app.stock.Stock;
import StockException.*;

public class validationRule {
	
	public static void validateId(List<Stock>slist,String id)throws ExceptionStock
	{
		Stock stock=new Stock(id);
		if(slist.contains(stock))
		{
			throw new ExceptionStock("id is already exixts");
		}
	}
	public static void validateClosingDate(List<Stock>slist,LocalDate date)throws ExceptionStock
	{
		
		if(date.isAfter(LocalDate.now()))
		{
			System.out.println("validate");
		}
		else
		{
			throw new ExceptionStock("closing date must be a future date.");
		}
	
	}
	

}
