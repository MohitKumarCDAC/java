package utils;

import java.util.List;

import com.app.cricketer.CricketPlayer;

import ExceptionRule.CricketPlayerException;


public class Validation {
	
	public static void validateEmail(List<CricketPlayer>list,String email)throws CricketPlayerException
	{
		CricketPlayer player=new CricketPlayer(email);
		if(list.contains(player))
		{
			throw new CricketPlayerException("Email is allready Exits!pls try another one:");
		}
		if(email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"))
		{
			System.out.println("Valid Email:");
		}
		else
		{
			throw new CricketPlayerException("Invalid email!");
		}
	}
	public static void validateRating(List<CricketPlayer>list,int rating)throws CricketPlayerException
	{
		if(rating>=0 && rating <=10)
		{
			System.out.println("validate:");
		}
		else
		{
			throw new CricketPlayerException("Rating is between 1 to 10!pls give in this range. ");
		}
	}
	public static void validatePhone(List<CricketPlayer>list,String phone)throws CricketPlayerException
	{
		String regex = "^\\d{10}$";
		  if( phone.matches(regex))
		  {
			  System.out.println("Valid Phone:");
		  }
		  else
		  {
			  throw new CricketPlayerException("Invalid Phone Number its greater than 10 digits:");
		  }
	}

}
