package Tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utils.util.*;
import com.app.contact.Contact;

public class ContactApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc=new Scanner(System.in))
		{
			List<Contact> clist=new ArrayList<>();
			populatedata(clist);
			int choice;
			do
			{
				System.out.println("1.Add Contact");
				System.out.println("2.Display contact");
				System.out.println("3.Update Contacts:");
				System.out.println("4.Remove Contact");
				System.out.println("0.exit");
				
				System.out.println("Choose options:");
				choice=sc.nextInt();
				
				try {
					
					switch (choice) {
					case 1:
						addContact(clist);
						break;
					case 2:
						displaydata(clist);
						break;
					case 3:
						updateContactDetails(clist);
						break;
					case 4:
						removeContact(clist);
						break;
					case 0:
					System.out.println("bye..bye");
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
