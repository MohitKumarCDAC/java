package Utils;

import java.time.LocalDate;
import java.util.Map;

import com.app.Customer.Customer;
import com.app.Customer.ServicePlan;

import CustomerException.CustomerException;

public class CustomerValidation {

	public static Customer validateInputs(String FirstName,String LastName,String Email,
			String Password,double regisAmount,String dob,String plan,Map<String,Customer>map)
					throws CustomerException
	{
		
		ServicePlan plantype=validatePlan(plan);
		validateBalance(plantype, regisAmount);
		validateEmail(Email, map);
		
		return new Customer(FirstName,LastName,Email,Password,regisAmount,LocalDate.parse(dob),plantype);
	}
	
public static ServicePlan validatePlan(String plan)throws CustomerException{
	return ServicePlan.valueOf(plan.toUpperCase());
	
}
//validate balance
public static void validateBalance(ServicePlan plan,double registrationBalane)throws CustomerException
{
	if(registrationBalane==plan.getPlan())
	{
		System.out.println("valid plan:");
	}
	else
	{
		throw new CustomerException("plan is not valid!!!!!");
	}
}
//validate Email
public static void validateEmail(String email,Map<String,Customer>map)throws CustomerException
{
	if(map.containsKey(email))
	{
		throw new CustomerException("Try with another Email this is registered!");
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
