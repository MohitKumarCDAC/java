package tester;
//mohit kumar mkg97274@gmail.com 123456 1000 1998-10-12 silver
import java.time.LocalDate;
import static utils.IOUtils.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static utils.CustomerUtils.*;
import customOrdering.*;

import com.app.customer.Customer;
import com.app.customer.ServicePlan;

import Exception_Customer.CustomerException;

//import static utils.CustomerValidation.validateInputs;

import static utils.CustomerUtils.populateList; 

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in))
		{
			List<Customer> custlist=new ArrayList<>();
			populateData(custlist);
			boolean exit=false;
			while(!exit)
			{
				System.out.println("____Options_____");
				System.out.println("1.Register Customer:");
				System.out.println("2.Login Customer:");
				System.out.println("3.Display Customer:");
				System.out.println("4.Update Password");
				System.out.println("5.Un subscribe customer");
				System.out.println("6.sort record by ascOrder:");
				System.out.println("7.Sort by DOB:");
				System.out.println("8.Data Restore In the Binary File:");
				System.out.println("0.exit");
				
				System.out.println("Select options:");
				try {
				switch(sc.nextInt())
				{
				case 1:

					utils.CustomerUtils.signup(custlist);
					System.out.println("Enter File name");
					storedataInFile(custlist, sc.next());
					System.out.println("Data Store in file in Binary Format:");
					
					break;
				case 2:
					
					utils.CustomerUtils.signin(custlist);
					System.out.println("Login Success");
					
					break;
				case 3:
					
				utils.CustomerUtils.Display(custlist);
					
					break;
				case 4:
					utils.CustomerUtils.updatePassword(custlist);
					break;
				case 5:
					utils.CustomerUtils.unSubscribeCustomer(custlist);
					break;
				case 6:
					Collections.sort(custlist,new EmailCompareByAsc());
					custlist.forEach(i->System.out.println(i));
					break;
				case 7:
					//sort by date of birth in ascending order
					Collections.sort(custlist,new sortByDob());
					//use forEach method(its very esy to display the data)
					custlist.forEach(i->System.out.println(i));
					break;
				case 8:
					//restore data from binary file
					System.out.println("Enter File Name:");
					Object details=restoreDataFile(sc.next());
					System.out.println(details.getClass());
					System.out.println(details);
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
