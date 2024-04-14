package utils;

import static utils.CustomerValidation.validateInputs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.app.customer.*;


import com.app.customer.ServicePlan;

import Exception_Customer.CustomerException;

import com.app.customer.Customer;

public class CustomerUtils {
	public static Scanner sc=new Scanner(System.in);
	//test list
	public static List<Customer> populateList()
	{
		List<Customer> cuslist=new ArrayList<Customer>();
		//String FirstName,String LastName,String Email,String Password,double regisAmount,LocalDate dob,ServicePlan plan)
		cuslist.add(new Customer("Mohit", "Gupta", "mg97274@gmail.com","mohit", 1000,LocalDate.parse("1999-10-10"), ServicePlan.SILVER));
		cuslist.add(new Customer("Vishal", "Nalaware", "vn97274@gmail.com","Vishal", 5000,LocalDate.parse("1998-10-10"), ServicePlan.GOLD));
		return cuslist;
	}

	private static double parse(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
	//signin or login
	public static int signin(List<Customer>list)throws CustomerException
	{
		System.out.println("Enter Email:");
		String email=sc.next();
		System.out.println("Enter Password:");
		String pass=sc.next();
		int index=list.indexOf(new Customer(email));
		if(index==-1)
			throw new CustomerException("Email does not match");
		Customer customer=list.get(index);
		if(customer.getPassword().equals(pass))
		{
			
			return index;
		}
		else
		{
			 throw new CustomerException("Pls check Your Password");
		}
	}
	//for display contents
	public static void Display(List<Customer>list)
	{
		System.out.println("All Customer Details:");
		for(Customer c:list)
		{
			System.out.println(c);
		}
	}
	//registrartion
	public static void signup(List<Customer>list)throws CustomerException
	{
		System.out.println("Enter::FirstName,LastName,Email,Password,regisAmount,dob, plan");
		Customer cref=validateInputs(sc.next(), sc.next(), sc.next(), sc.next(),sc.nextDouble(),sc.next(), sc.next());
		list.add(cref);
		System.out.println("Customer Registered!!!!");
	}
	public static void updatePassword(List<Customer>list)throws CustomerException
	{
		System.out.println("Enter Email And Your Old Password");
		System.out.println("==================================");
		Customer customer=list.get(signin(list));
		System.out.println("Enter new Password");
		customer.setPassword(sc.next());
		System.out.println("Update password");
	}
	public static void unSubscribeCustomer(List<Customer>list)throws CustomerException
	{
		Customer customer=list.get(signin(list));
		list.remove(customer);
		System.out.println("Sorry to say!you are Removed");
	}

}
