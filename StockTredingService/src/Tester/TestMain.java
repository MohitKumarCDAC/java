package Tester;

import java.util.ArrayList;
import static utils.IOutils.*;
import java.util.List;
import java.util.Scanner;
import static utils.utils.*;

import com.app.stock.Stock;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc=new Scanner(System.in)){
			List<Stock>slist=new ArrayList<Stock>();
			populateList(slist);
			int choice;
			do
			{
				System.out.println("1.Add Stock:");
				System.out.println("2.Display All Stock:");
				System.out.println("3.Display Stock By Company Name:");
				System.out.println("4.Purchase stocks:");
				System.out.println("5.Sell Stock:");
				System.out.println("6.Read Binary File:");
				System.out.println("0.Exit:");
				
				System.out.println("Choose your Option:");
				choice=sc.nextInt();
				
				try
				{
					
					switch (choice) {
					case 1:
						//add
						addStock(slist);
						break;
					case 2:
						//display
						displayStock(slist);
						break;
					case 3:
						displayBycompanyname(slist);
						break;
					case 4:
						//purchase product
						purchaseProduct(slist);
						System.out.println("Enter File name");
						saveProductinBinFile(slist, sc.next());
						System.out.println("Purchase details save in file,with appropriate file");
						break;
					case 5:
						//sell product
						sellProduct(slist);
						System.out.println("Enter File name");
						saveProductinBinFile(slist, sc.next());
						System.out.println("Purchase details save in file,with appropriate file");
						break;
					case 6:
						//read file
						System.out.println("Enter file name:");
						Object details=takeFromBinaryFile(sc.next());
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
					System.out.println(e);
				}
			}while(choice!=0);
			
		}
	}

}
