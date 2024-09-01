package Tester;

import java.util.Scanner;

import Dao.UserDawImp;
import user.User;

public class TestDBAAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in)){
			//initial phase create dao
			UserDawImp userdao=new UserDawImp();
			int choice;
			do
			{
				System.out.println("1.Login");
				System.out.println("0.Exit");
				
				System.out.println("Enter Youe Choice:");
				choice=sc.nextInt();
				try {
					
					switch (choice) {
					case 1:
						System.out.println("Enter Email:");
						String email=sc.next();
						System.out.println("Enter Password:");
						String password=sc.next();
						User user=userdao.userAuthentication(email, password);
						if(user!=null)
						{
							System.out.println("login success:");
						}
						else
						{
							System.out.println("Invalid Email or password:");
						}
						
						break;
					case 2:
						System.out.println("bye .....bye");
						break;
					default:
						break;
					}
					
				}catch (Exception e) {
					e.getStackTrace();
				}
			}while(choice!=0);
			
		}catch (Exception e) {
			e.getStackTrace();
		}

	}

}
