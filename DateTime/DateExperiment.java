package DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateExperiment {
	//age check
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter Birth date of person(YYYY-MM-DD)");
		String inputdate=sc.nextLine();//takeinput
		DateTimeFormatter formater=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate birthdate=LocalDate.parse(inputdate,formater);//parse string to date
		LocalDate currentdate=LocalDate.now();//current date
		Period period=Period.between(birthdate, currentdate);//find age birthdate and currentdate
		int age=period.getYears();
		System.out.println("Age="+age);
		
		if(age>=40 && age<60)
		{
			System.out.println("Middle age");
		}
		else if(age<25 && age>20)
		{
			System.out.println("Youth");
		}
		else if(age>15 && age<=18)
		{
			System.out.println("Teenagers");
		}
		else
			System.out.println("old");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("invalid date formate pls take(YYYY-MM-DD) ");
		}
sc.close();
	}

}
