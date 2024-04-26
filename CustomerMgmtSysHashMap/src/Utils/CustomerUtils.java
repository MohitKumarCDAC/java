package Utils;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.app.Customer.Customer;
import com.app.Customer.ServicePlan;

import static Utils.CustomerValidation.*;
import static Utils.IOUtils.storeCustomerDetails;

import CustomerException.CustomerException;

public class CustomerUtils {
	public static Scanner sc=new Scanner(System.in);
	public static void signup(Map<String,Customer>map)throws CustomerException
	{
//		System.out.println("Enter::FirstName,LastName,Email,Password,regisAmount,dob, plan");
//		Customer cref=validateInputs(sc.next(), sc.next(), sc.next(), sc.next(),sc.nextDouble(),sc.next(), sc.next(),map);
//		map.put(cref.getEmail(), cref);
//		System.out.println("Customer Registered!!!!");
		System.out.println("Enter First name:");
		String fname=sc.next();
		
		System.out.println("Enter Last name:");
		String lname=sc.next();
		
		System.out.println("Enter Email:");
		String email=sc.next();
		validateEmail(email, map);
		
		System.out.println("Enter Password:");
		String pass=sc.next();
		
		System.out.println("Enter Name of  Service Plan");
		String plan=sc.next();
		ServicePlan plantype=validatePlan(plan);
		
		System.out.println("Enter Registrartion Amount:");
		double registrationamount=sc.nextDouble();
		validateBalance(plantype, registrationamount);
	
		System.out.println("Enter Date of Birth(yyyy-MM-dd):");
		String dob=sc.next();
		map.put(email,new Customer(fname,lname,email,pass,registrationamount,LocalDate.parse(dob),plantype));
		System.out.println("Registered!");
		
	}
	public static void Display(Map<String,Customer>map)throws CustomerException
	{
//		for(Customer a:map.values())
//		{
//			System.out.println(a);
//		}
		//functional forEach loop
		map.values().forEach(c->System.out.println(c));
	}
	public static Customer login(Map<String,Customer>map)throws CustomerException
	{
		System.out.println("Enter Email:");
		String email=sc.next();
		System.out.println("Enter Password:");
		String pass=sc.next();
		Customer cust=map.get(email);
		{
			if(cust!=null)
			{
				if(cust.getPassword().equals(pass))
				{
					return cust;
				}
				else {
					
					throw new CustomerException("password does not match:");
				}
			}else
			{
				throw new CustomerException("invalid email");
			}
		}
	}
	public static void updatePassword(Map<String,Customer>map)throws CustomerException{
		System.out.println("First Login Ur old Password.");

		Customer cust =login(map);
		System.out.println("Enter new Password:");
		String password=sc.next();
		cust.setPassword(password);
		System.out.println("update password");
	}
	public static void UnSubscribe(Map<String,Customer>map)throws CustomerException
	{
		Customer customer=login(map);
		map.remove(customer.getEmail());
		System.out.println("You are removed !!");
	
		
	}
	

}
