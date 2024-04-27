package TestProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utils.utils.*;
import com.app.PenStock.Pen;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in);){
		List<Pen>listpen=new ArrayList<>();
		populatedList(listpen);
		int choice;
		do
		{
			System.out.println("1.Add pen:");
			System.out.println("2.Display records:");
			System.out.println("3.Update Stock Record:");
			System.out.println("4.Give Discount:");
			System.out.println("5.Remove pen in the list");
			System.out.println("0.exit");
			
			System.out.println("Enter Oprions:");
			choice=sc.nextInt();
			try {
			switch (choice) {
			case 1:
				//add pen
				addpen(listpen);
				break;
			case 2:
				//display records
				displayrecord(listpen);
				break;
			case 3:
				stockUpdate(listpen);
				break;
			case 4:
				giveDiscount(listpen);
				break;
			case 5:
				removepen(listpen);
				break;

			case 0:
				System.out.println("bye.............bye");
				break;
			}
			}catch (Exception e) {
				e.getStackTrace();
			}
			
		}while(choice!=0);

		}
	}

}
