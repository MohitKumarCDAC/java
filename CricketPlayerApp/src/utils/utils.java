package utils;

import java.util.List;
import java.util.Scanner;
import ExceptionRule.*;


import com.app.cricketer.CricketPlayer;
import static utils.Validation.*;

public class utils {

	private static Scanner sc=new Scanner(System.in);
	public static void addPlayer(List<CricketPlayer>list)throws CricketPlayerException
	{
		System.out.println("Enter Player Name");
		String name=sc.next();
		System.out.println("Enter Player Age:");
		int age=sc.nextInt();
		System.out.println("Enter Player Email ID:");
		String Email_Id=sc.next();
		validateEmail(list, Email_Id);
		System.out.println("Enter Your Phone Number:");
		String phone=sc.next();
		System.out.println("Enter the Rating Of Player:");
		int rating=sc.nextInt();
		validateRating(list, rating);
		
		list.add(new CricketPlayer(name, age, Email_Id, phone, rating));
		}
	
	public static void displayRecords(List<CricketPlayer>list)
	{
		//display by forEach method
		list.forEach(i->System.out.println(i));
	}
	public static void searchByName(List<CricketPlayer>list)throws CricketPlayerException
	{
		System.out.println("Enter Name of Player:");
		String name=sc.next();
		for(CricketPlayer player:list)
		{
			if(player.getName().equals(name))
			{
				System.out.println("Name:"+player.getName()+":"+"Age:"+player.getAge()+":"+
						"EmailID:"+player.getEmail_Id()+":"+"Phone Number:"+player.getPhone()+":"+"Rating"+player.getRating());
			}
		}
		
	}
	public static void updateRating(List<CricketPlayer>list)throws CricketPlayerException
	{
		System.out.println("Enter Email:");
		String email=sc.next();
		int index=list.indexOf(new CricketPlayer(email));
		if(index==-1)
		{
			throw new CricketPlayerException("Email does not found:");
		}
		System.out.println("Enter new Rating:");
		int rating=sc.nextInt();
		list.get(index).setRating(rating);
		System.out.println("Record Updated!");
	}
	
	public static void populateList(List<CricketPlayer>list)
	{
		list.add(new CricketPlayer("mohit", 24, "mohit@gmail.com", "9852961593", 10));
		list.add(new CricketPlayer("rohit", 20, "rohit@gmail.com", "8852961593", 5));
		list.add(new CricketPlayer("ritesh", 20, "ritesh@gmail.com", "9852461593", 4));
		list.add(new CricketPlayer("IndraJeet", 25, "indrajeet@gmail.com", "7852961593", 1));
		list.add(new CricketPlayer("kush", 24, "kush@gmail.com", "7903576608", 10));
	}
	
}
