package Tester;
//mohit gupta mg97274@gmail.com mohit 1000 1999-10-10 silver
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.Customer.*;

import Utils.CustomerUtils;
import Utils.CustomerValidation;
import static Utils.CustomerData.*;
import static Utils.IOUtils.restoreDetails;
import static Utils.IOUtils.storeCustomerDetails;

import custom_ordering.CustomerAscDOBComparetor;

public class CustomerApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Customer> map = new HashMap<>();
			populatedlist(map);
			int choice;
			do {
				System.out.println("---------Options---------------");
				System.out.println("1.Customer Registration ");
				System.out.println("2.Display ALL");
				System.out.println("3.login");
				System.out.println("4.Update Password");
				System.out.println("5.Unsbscribe Customer");
				System.out.println("6.sord by ascending order:");
				System.out.println("7.Restore Data into files:");
				System.out.println("0.exit");

				System.out.println("Enter Choice:");
				choice = sc.nextInt();
				try {
					switch (choice) {
					case 1:
						// register customer
							CustomerUtils.signup(map);
							System.out.println("Enter File Name:");
							storeCustomerDetails(map, sc.next());
							System.out.println("Data Saved into file");
						
						break;

					case 2:
						// display customer
						CustomerUtils.Display(map);
						break;
					case 3:
						// login customer
						CustomerUtils.login(map);
						break;
					case 4:
						// update password
						CustomerUtils.updatePassword(map);
						break;
					case 5:
						//remove customer
						CustomerUtils.UnSubscribe(map);
						break;
					case 6:
						System.out.println("Display the customer sorted as per asc by key(email) based ");
						// sorting criteria --key based or value based ?
						// key based -- TreeMap , asc order - Natural Order , TreeMap() , TreeMap(map)
						Map<String,Customer > sortedMap = new TreeMap(map);
						// JVM invokes --TimSort -- Integer's comapreTo
						//here sorting is proceed by key(email) based
						for (Customer a : sortedMap.values())
							System.out.println(a);
						break;
					case 7:
						//restore data into files
						System.out.println("Enter File name:");
						Object details=restoreDetails(sc.next());
						System.out.println(details.getClass());
						System.out.println(details);
						break;
					case 0:
						System.out.println("Bye.....Bye!!!!");
						break;
						
					
				}

				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
				}

			} while (choice != 0);

		}
	}

}
