package Tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static utils.utils.*;
import static utils.IOUtils.*;
import comparator.*;
import com.app.company.Employee;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in))
		{
			List<Employee>list=new ArrayList<Employee>();
			int choice;
			do
			{
				System.out.println("1.Add Full Time Employee:");
				System.out.println("2.Add Part Time Employee:");
				System.out.println("3.Display All Data:");
				System.out.println("4.Search Employee by Adhar number:");
				System.out.println("5.Display all employee details sorted by date of joining");
				System.out.println("6.Delete an employee by Emp Id");
				System.out.println("7.Restore data from Binary File");
				System.out.println("0.Exit");
				
				System.out.println("Choose Options");
				choice=sc.nextInt();
				try {
					switch (choice) {
					case 1:
						//add Full Time Employee:
						addFullTimeEmp(list);
						System.out.println("Enter file Name");
						storeDataInFile(list, sc.next());
						System.out.println("Store Data into file:");
						break;
					case 2:
						//add part time Employee
						addPartTimeEmployee(list);
						System.out.println("Enter file Name");
						storeDataInFile(list, sc.next());
						System.out.println("Store Data into file:");
						
						break;
					case 3:
						displayAll(list);
						break;
					case 4:
						searchEmployee(list);
						break;
					case 5:
						//sort
						Collections.sort(list, new SortByDate());
						list.forEach(i->System.out.println(i));
						break;
					case 6:
						//delete employee by index number
						deleteEmployee(list);
						break;
					case 7:
						System.out.println("Enter File Name");
						Object details=restoreData(sc.next());
						System.out.println(details.getClass());
						System.out.println(details);
						
						break;
					case 0:
						System.out.println("bye..........bye");
						break;
					default:
						break;
					}
				}catch (Exception e) {
					e.getStackTrace();
				}
			}while(choice!=0);
		}
	}

}
