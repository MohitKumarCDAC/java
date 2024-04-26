package Test;

import java.util.ArrayList;
import static utils.IOUtils.*;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static utils.utils.*;
import comparing.*;

import com.app.cricketer.CricketPlayer;

public class TestMain {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			int choice;
			List<CricketPlayer> list=new ArrayList<>();
			populateList(list);
			do
			{
				System.out.println("1.Add Cricket Player");
				System.out.println("2.Display Records:");
				System.out.println("3.Search Records:");
				System.out.println("4.Update Rating");
				System.out.println("5.Display All Cricketers in sorted form by rating.");
				System.out.println("6.Data Rrestore Into the File:");
				System.out.println("0.Exit");
				
				System.out.println("Choose Ant Option:");
				choice=sc.nextInt();
				try
				{
					switch (choice) {
					case 1:
						//add cricketplayer in list
						addPlayer(list);
						System.out.println("Enter File Name:");
						storeDataIntoFile(list, sc.next());
						System.out.println("Data store into file:");
						
						break;
					case 2:
						//display from list
						displayRecords(list);
						break;
					case 3:
						//search from the list
						searchByName(list);
						break;
					case 4:
						//update rating
						updateRating(list);
						break;
					case 5:
						Collections.sort(list, new comparingByrating());
						list.forEach(i->System.out.println(i));
						break;
					case 6:
						//read from the binary file
						System.out.println("ENter File Name:");
						Object details=restoreData(sc.next());
						System.out.println(details.getClass());
						System.out.println(details);
						System.out.println("Data Restored:");
						break;
					case 0:
						System.out.println("bye...bye");
						break;

					default:
						break;
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}while(choice!=0);
		}

	}

}
