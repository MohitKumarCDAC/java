package utils;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.app.customer.Customer;
import com.app.customer.ServicePlan;

import Exception_Customer.CustomerException;

public class CustomerValidation {
	Scanner sc=new Scanner(System.in);

//	public static Customer validateInputs(String FirstName,String LastName,String Email,
//			String Password,double regisAmount,String dob,String plan,List<Customer>list)
//					throws CustomerException
//	{
//		
//		ServicePlan plantype=validatePlan(plan);
//		validateBalance(plantype, regisAmount);
//		validateEmail(Email, list);
//		
//		return new Customer(FirstName,LastName,Email,Password,regisAmount,LocalDate.parse(dob),plantype);
//	}
	
	public static ServicePlan validatePlan(String plan) 
			throws CustomerException {
		return ServicePlan.valueOf(plan.toUpperCase());
		
		}
	
	public static void validateBalance(ServicePlan plan,double registerBalance)throws CustomerException
	{
		if(registerBalance==plan.getPlan())
			System.out.println("valid plan:");
		else
			throw new CustomerException("Register Balanace does not match with service plan::Balance is:"+plan.getPlan()+"plan is:");
	}
	public static void validateEmail(String email ,List<Customer>list)throws CustomerException
	{
		Customer customer=new Customer(email);
		if(list.contains(customer))
		{
		throw new CustomerException("Email Exists!pls take another one");
		}
		if(email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"))
		{
			System.out.println("Valid Email:");
		}
		else
		{
			throw new CustomerException("Invalid email!");
		}
		
	}
	
	
	
}
