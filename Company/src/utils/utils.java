package utils;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import static utils.validateInput.*;
import com.app.company.Employee;
import com.app.company.FTPemployee;
import com.app.company.PTEemployee;

import CustomException.CompanyException;

public class utils {
	private static Scanner sc=new Scanner(System.in);
	public static void addFullTimeEmp(List<Employee>list)throws CompanyException
	{
		System.out.println("Enter Name of Employee:");
		String name=sc.next();
		
		System.out.println("Enter Date Of Joining:");
		String date=sc.next();
		validateDate(date);
		
		System.out.println("Enter Phone Number:");
		String phone=sc.next();
		validateNumber(phone);
		
		System.out.println("Enter Aadhar Number:");
		String Aadhar=sc.next();
		validateAddhar(list, Aadhar);
		
		System.out.println("Enter Salary:");
		double salary=sc.nextDouble();
		
		list.add(new FTPemployee(name,LocalDate.parse(date), phone, Aadhar, salary));
		System.out.println("Add in the list:");
	}
	
	public static void addPartTimeEmployee(List<Employee>list)throws CompanyException
	{
		System.out.println("Enter Name of Employee:");
		String name=sc.next();
		
		System.out.println("Enter Date Of Joining:");
		String date=sc.next();
		validateDate(date);
		
		System.out.println("Enter Phone Number:");
		String phone=sc.next();
		validateNumber(phone);
		
		System.out.println("Enter Aadhar Number:");
		String Aadhar=sc.next();
		validateAddhar(list, Aadhar);
		
		System.out.println("Enter Hourly Payment:");
		double hourlypayment=sc.nextDouble();
		
		list.add(new PTEemployee(name, LocalDate.parse(date), phone, Aadhar, hourlypayment));
		System.out.println("Added in the list:");
	}
	public static void displayAll(List<Employee>list)
	{
		list.forEach(i->System.out.println(i));
	}
	public static void searchEmployee(List<Employee>list)throws CompanyException
	{
		System.out.println("Enter Adhar number:");
		String adhar=sc.next();
		for(Employee e:list)
		{
			if(e.getAadharnumber().equals(adhar))
			{
				System.out.println(e);
			}
			else
			{
				throw new CompanyException("pls enter valid Aadhar:");
			}
		}
	}
	public static void deleteEmployee(List<Employee>list)
	{
		System.out.println("Enter Employee id");
		int id=sc.nextInt();
/*		Employee emp=list.get(id);
		list.remove(emp);
		System.out.println("Data Removed");*/
		list.removeIf(e->e.getEmp_id()==id);
		System.out.println("Employee delete:");
	}

}
