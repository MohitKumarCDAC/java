import static DButils.TestConnectio.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class DeleteRecord {

	public static void main(String[] args) {
		//create Scanner object to take input from the user
		Scanner sc=new Scanner(System.in);
		try{
			//create connection
			Connection con=openConnection();
			//run sql query with PreparedStatement interface 
			//con object preparestatement()
			
			PreparedStatement pstmt=con.prepareStatement("delete from test1 where tid=?");
			//take id from keyboard
			System.out.println("Enter Id which you want to delete");
			int id=sc.nextInt();
			
			//set
			pstmt.setInt(1, id);
			//
			int noOfRows=pstmt.executeUpdate();
			//check
			if(noOfRows>0)
			{
				System.out.println("Data deleted from Data Base whose Id is"+id);
			}
			else
			{
				System.out.println("Record not found:");
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
