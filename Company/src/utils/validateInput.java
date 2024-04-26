package utils;

import java.time.LocalDate;
import java.util.List;

import com.app.company.Employee;

import CustomException.CompanyException;

public class validateInput {

	public static LocalDate validateDate(String date)
	{
		return LocalDate.parse(date);
	}
	public static void validateNumber(String phone)throws CompanyException
	{
		String regex="^\\d{10}$";
		if(phone.matches(regex))
		{
			System.out.println("Valid Phone Number:");
		}
		else
		{
			throw new CompanyException("invalid Phone Number Pls Enter Valid Number:");
		}
	}
	
	public static void validateAddhar(List<Employee>list, String Adhar)throws CompanyException
	{
		Employee emp=new Employee(Adhar);
		if(list.contains(emp))
		{
			throw new CompanyException("This Aadhar number is allready Exists:");
		}
		String regex="^\\d{12}$";
		if(Adhar.matches(regex))
		{
			System.out.println("Valid Aadhar Number:");
		}
		else
		{
			throw new CompanyException("Invalid Aadhar Number: ");
		}
	}
}
