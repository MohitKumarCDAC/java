import static DButils.TestConnectio.openConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

import DButils.TestConnectio;
public class SearchData {

	public static void main(String[] args) {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//here if we use Scanner insted of BufferReader very easy to search data
		Scanner sc=new Scanner(System.in);
		try {
			//load driver
			//establish connection
			Connection con=openConnection();
			PreparedStatement pstmt=con.prepareStatement("select * from test1 where tid=?");
			System.out.println("Enter Id:");
		//this line is correct but we use Scanner class object
			//int id=Integer.parseInt(br.readLine());
			int id=sc.nextInt();
			pstmt.setInt(1, id);
			//data comes in resultset
			ResultSet rs=pstmt.executeQuery();
			//check if data is found
			if(rs.next())
			{
				System.out.println("Name:"+rs.getString(2)+":"+"City:"+rs.getString(3)+":"+"Age:"+rs.getInt(4));
			}else
			{
				System.out.println("no data found");
			}
			
			con.close();
			pstmt.close();
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
