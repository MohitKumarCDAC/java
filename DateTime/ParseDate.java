package DateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class ParseDate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date (yyyy-MM-dd)");
		String date=sc.next();
		LocalDate ld=LocalDate.parse(date);//convert string to date by parse method
		System.out.println("Date:"+ld.toString());//convert date to string

	}

}
