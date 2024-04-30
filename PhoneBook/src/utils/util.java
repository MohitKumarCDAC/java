package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.contact.Contact;

import exception.PhoneBookException;

public class util {
	public static Scanner sc=new Scanner(System.in);
	
	public static void validateName(String name,List<Contact>clist)throws PhoneBookException
	{
		Contact contacts=new Contact(name);
		if(clist.contains(contacts))
		{
			throw new PhoneBookException("Try with Other Name:Name is Allready Exits");
		}
	}
	
	public static void validateDate(String date,List<Contact>clist)throws PhoneBookException
	{
		LocalDate.parse(date);
		Contact contacts=new Contact(date);
		if(clist.contains(contacts))
		{
			throw new PhoneBookException("DOB is Allready exits:try with other");
		}
	}
	
	public static void validatePhone(String phone)throws PhoneBookException
	{
		String regex="^\\d{10}$";
		if(phone.matches(regex))
		{
			System.out.println("Valid phone Number");
		}
		else
		{
			throw new PhoneBookException("Invalid Phone!check it");
		}
	}
	
	public static void validateEmail(String email)throws PhoneBookException
	{
		String regex="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		if(email.matches(regex))
		{
			System.out.println("valid Email");
		}
		else
		{
			throw new PhoneBookException("invalid email");
		}
	}
	
	public static void addContact(List<Contact>clist)throws PhoneBookException
	{
		System.out.println("Enter Phone Number:");
		String phone=sc.next();
		validatePhone(phone);
		
		System.out.println("Enter Name :");
		sc.nextLine();
		String name=sc.nextLine();
		validateName(name, clist);
		
		System.out.println("Enter Date Of Birth:");
		String date=sc.next();
		validateDate(date, clist);
		
		System.out.println("Enter Email");
		String email=sc.next();
		validateEmail(email);
		
		clist.add(new Contact(phone, name, LocalDate.parse(date), email));
		System.out.println("saved data:");
		
	}
	
	public static void displaydata(List<Contact>clist)
	{
		clist.forEach(i->System.out.println(i));
	}
	public static void updateContactDetails(List<Contact>clist)throws PhoneBookException
	{
		System.out.println("Enter name");

		String name=sc.next();
		System.out.println("Enter DOB");
		String date=sc.next();
		validateDate(date, clist);
		boolean contactfound=false;
		for(Contact con:clist)
		{
			if(con.getName().equals(name) && con.getDate().equals(LocalDate.parse(date)))
			{
				contactfound=true;
				System.out.println("Enter new Phone Number:");
				con.setPhoneNumber(sc.next());
				//update email
				System.out.println("You want to update Your email(Y|n)");
				char choice=sc.next().charAt(0);
				if(choice=='Y'||choice=='y')
				{
					System.out.println("Enter New Email_id");
					String email=sc.next();
					con.setEmail(email);
					System.out.println("Email update Successfully!");
				}
				else
				{
					System.out.println("Email Update cancle:");
				}
				break;
			}
			
		}
		if(!contactfound)
		{
		 throw new PhoneBookException("pls Enter correct details");	
		}	
	}
	
	public static void removeContact(List<Contact>clist)
	{
		List<Contact>remove=new ArrayList<Contact>();
		clist.stream().filter(r->r.getDate().plusYears(80).isBefore(LocalDate.now()))
		.forEach(i->{System.out.println(i);
		remove.add(i);});
		remove.forEach(p->clist.remove(p));
		System.out.println("remove All");
	}
	
	public static void populatedata(List<Contact>clist)
	{
		clist.add(new Contact("9090909090", "mohit", LocalDate.parse("1999-10-10"),"mohit@gmail.com"));
		clist.add(new Contact("9898989898", "rohit", LocalDate.parse("2001-10-10"),"rohit@gmail.com"));
		clist.add(new Contact("9707976765", "deepak", LocalDate.parse("1997-10-10"),"deepak@gmail.com"));
		clist.add(new Contact("1234565432", "akash", LocalDate.parse("1996-10-10"),"akash@gmail.com"));
		clist.add(new Contact("1232565432", "rohan", LocalDate.parse("1991-10-10"),"rahul@gmail.com"));
		clist.add(new Contact("7232565432", "rina", LocalDate.parse("1900-10-10"),"rina@gmail.com"));
		
	}

}
