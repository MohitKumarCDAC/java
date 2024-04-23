import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utils.utils.*;

import Watch.Watch;

public class Testter {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
		List<Watch> watchlist=new ArrayList<Watch>();
		populatelist(watchlist);
		int choice;
		do
		{
			System.out.println("1.Add Watch in list:");
			System.out.println("2.Display Saved Watch List");
			System.out.println("3.Update Stock:");
			System.out.println("4.Set Discount:");
			System.out.println("5.Remove watch:");
			System.out.println("0.Exit");
			
			System.out.println("Select options:");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				addwatch(watchlist);
				break;
			case 2:
				displayWatchlist(watchlist);
				break;
			case 3:
				//update stock
				updateStock(watchlist);
				break;
			case 4:
				//set discount
				setDiscount(watchlist);
				break;
			case 5:
				//remove watch
				removeWatch(watchlist);
				
				break;
			case 0:
				System.out.println("bye..............bye");
				break;

			default:
				break;
			}
			
			
		}while(choice!=0);
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
