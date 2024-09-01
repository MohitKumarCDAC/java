package co.app.Tester;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.app.dao.BankAccountDao;
import com.app.dao.UserDaoImpl;
import com.app.entities.User;

public class TestLayeredJdbcApp {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)){
			
			UserDaoImpl userdao=new UserDaoImpl();
			BankAccountDao acctDao=new BankAccountDao() {
				
				@Override
				public String transferFunds(int srcid, int destid, double amount) throws SQLException {
					// TODO Auto-generated method stub
					return null;
				}
			};
			
			boolean exit=false;
			while(!exit) {
				System.out.println("-------------Options-------------");
				System.out.println("1.Login");
				System.out.println("2.Display User Details by Date Of Birth");
				System.out.println("3.Voter Registration");
				System.out.println("4.change password");
				System.out.println("5.Delete Voter Details");
				System.out.println("6.Transfer Fund:");
				System.out.println("0.Exit!");
				
				try {
					switch (sc.nextInt()) {
					case 1://login
						System.out.println("Enter Email");
						String email=sc.next();
						System.out.println("Enter Password");
						String pass=sc.next();
						
						User user=userdao.signIn(email, pass);
						if(user!=null)
						{
							System.out.println("Login Success:");
							System.out.println(user);
						}
						else {
							System.out.println("Invalid Email or Password");
						}
						
						break;
					case 2:
						System.out.println("Enter Start Date Of Birth(year-month-day)");
						String sdob=sc.next();
						System.out.println("Enter End Date Of Birth(year-month-day)");
						String edob=sc.next();
						List<User> list=userdao.getUserDetails(Date.valueOf(sdob), Date.valueOf(edob));
						System.out.println("Users.......");
						list.forEach(System.out::println);
						break;
					case 3:
						System.out.println("Enter Voter's details - firstName,  lastName, email,  password,  dob");
						user=new User(sc.next(), sc.next(), sc.next(), sc.next(), Date.valueOf(sc.next()));
						System.out.println("Reg status " + userdao.voterRegistration(user));
						break;
					case 4://change password
						System.out.println("Change password(enter email,oldpwd and newpwd)");
						System.out.println("Enter Email");
						String emal=sc.next();
						System.out.println("Enter Old password");
						String oldpwd=sc.next();
						System.out.println("Enter new Password");
						String newpwd=sc.next();
						System.out.println(userdao.changePassword(emal, oldpwd, newpwd));
						break;
					case 6:
						System.out.println("src ID");
						int src=sc.nextInt();
						System.out.println("dest ID");
						int dest=sc.nextInt();
						System.out.println("Enter Amount:");
						double ac=sc.nextDouble();
						System.out.println(acctDao.transferFunds(src, dest, ac));
						
						break;

					default:
						break;
					}
				}catch (Exception e) {
					System.out.println(e);
				}
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
