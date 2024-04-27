package Tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static utils.utils.*;
import com.store.app.Items;
import static utils.IOUtils.*;

import comparator.*;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc=new Scanner(System.in)){
			List<Items>list=new ArrayList<Items>();
			populateData(list);
			
			int choice;
			
			do {
				System.out.println("1.Add Data");
				System.out.println("2.Display Data");
				System.out.println("3.sort by ItemCode");
				System.out.println("4.sort by Price:");
				System.out.println("5.Restore Data");
				System.out.println("0.Exit");
				
				System.out.println("Enter your choice:");
				choice=sc.nextInt();
				try {
					switch (choice) {
					case 1:
						//add
						additems(list);
						break;
					case 2:
						//display
						displayItem(list);
						break;
					case 3:
						List<Items>list1;
						Collections.sort(list, new comparebyItemcode());
						list.forEach(i->System.out.println(i));
						System.out.println("Enter File Name:");
						storeItemInFile(list, sc.next());
						
						break;
					case 4:
						Collections.sort(list,new sortByprice());
						list.forEach(i->System.out.println(i));
						System.out.println("Enter File Name:");
						storeItemInFile(list, sc.next());
						System.out.println("Data Saved into file:");
						break;
					case 5:
						System.out.println("Enter File Name:");
						Object details=restoreDataFromFile(sc.next());
						System.out.println(details.getClass());
						System.out.println(details);
						break;
					case 0:
						System.out.println("bye...bye");
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
