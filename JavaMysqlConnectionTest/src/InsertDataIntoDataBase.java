import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import static DButils.TestConnectio.*;

public class InsertDataIntoDataBase {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//take input from the user we use BufferReader insted of scanner
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			//load Driver
			Connection con=openConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into test1(tName,tCity,Age) values (?,?,?)");
			//set values to query
			System.out.println("Enter Name:");
			String name=br.readLine();
			System.out.println("Enter city");
			String state=br.readLine();
			System.out.println("Enter age:");
			int age=br.read();
			
			pstmt.setString(1, name);
			pstmt.setString(2, state);
			pstmt.setInt(3, age);
			
			pstmt.executeUpdate();
			System.out.println("Data Inserted");
			con.close();
			pstmt.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
