package tester;
//mohit kumar mkg97274@gmail.com 123456 1000 1998-10-12 silver
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utils.CustomerUtils.*;

import com.app.customer.Customer;
import com.app.customer.ServicePlan;

import Exception_Customer.CustomerException;

import static utils.CustomerValidation.validateInputs;

import static utils.CustomerUtils.populateList; 

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in))
		{
			List<Customer> custlist=new ArrayList<>();
			//List<Customer> custlist=populateList();
					//its a data holder method
//			for(Customer c:custlist)
//			System.out.println(c);
			boolean exit=false;
			while(!exit)
			{
				System.out.println("____Options_____");
				System.out.println("1.Register Customer:");
				System.out.println("2.Login Customer:");
				System.out.println("3.Display Customer:");
				System.out.println("4.Update Password");
				System.out.println("5.Un subscribe customer");
				System.out.println("0.exit");
				
				System.out.println("Select options:");
				try {
				switch(sc.nextInt())
				{
				case 1:
//					System.out.println("Enter::FirstName,LastName,Email,Password,regisAmount,dob, plan");
//					Customer cref=validateInputs(sc.next(), sc.next(), sc.next(), sc.next(),sc.nextDouble(),sc.next(), sc.next());
//					custlist.add(cref);
//					System.out.println("Customer Registered!!!!");
					utils.CustomerUtils.signup(custlist);
					break;
				case 2:
					//List<Customer>list;
//					System.out.println("Enter Email:");
//					String email=sc.next();
//					System.out.println("Enter Password:");
//					String pass=sc.next();
//					int index=custlist.indexOf(new Customer(email));
//					if(index==-1) {
//						throw new CustomerException("Customer do not exists:");
//					}
//					Customer customer=custlist.get(index);
//					if(customer.getPassword().equals(pass))
//					{
//						System.out.println("Login Success:"+index);
//					}else {
//					throw new CustomerException("password does not exists:");
//					}
					
					utils.CustomerUtils.signin(custlist);
					System.out.println("Login Success");
					
					break;
				case 3:
//					System.out.println("All Customer Details:");
//					for(Customer c:custlist)
//					{
//						System.out.println(c);
//					}
					utils.CustomerUtils.Display(custlist);
					
					break;
				case 4:
					utils.CustomerUtils.updatePassword(custlist);
					break;
				case 5:
					utils.CustomerUtils.unSubscribeCustomer(custlist);
					break;
				case 0:
					exit=true;
					System.out.println("bye");
				}
				
				}catch(Exception e)
				{
					sc.nextLine();
					System.out.println(e);
				}
			}
		}

	}

}
