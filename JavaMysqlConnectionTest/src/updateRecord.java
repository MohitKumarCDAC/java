import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import static DButils.TestConnectio.*;

public class updateRecord {

	public static void main(String[] args) {
		//create bufferReader to take input from user
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//but here we use Scanner 
		Scanner sc=new Scanner(System.in);
		try {
			//stablish connection
			Connection con=openConnection();
			//write query in prepareStatement
			PreparedStatement pstmt=con.prepareStatement("select * from test1 where tid=?");
			//enter id to search student
			System.out.println("Enter Student Id");
			int id=sc.nextInt();
			pstmt.setInt(1, id);
			//result set
			ResultSet rs=pstmt.executeQuery();
			//then we check
			if(rs.next())
			{
				System.out.println("Name:"+rs.getString(2)+":"+"City:"+rs.getString(3)+":"+"Age:"+rs.getInt(4));
			}else
			{
				System.out.println("no data found");
			}
			
			//update data
			System.out.println("Update Data:");
			System.out.println("Enter Name:");
			String name=br.readLine();
			System.out.println("Enter city");
			String city=br.readLine();
			System.out.println("Enter age:");
			//both are correct we use br and sc both
//			int age=Integer.parseInt(br.readLine());
			int age=sc.nextInt();
//			System.out.println("enter id");
//			id=sc.nextInt();
			
			pstmt=con.prepareStatement("update test1 set tname=?,tcity=?,Age=? where tid=?");
			pstmt.setString(1, name);
			pstmt.setString(2,city );
			pstmt.setInt(3, age);
			pstmt.setInt(4,id );
			
			int rowaffected=pstmt.executeUpdate();
			System.out.println("data update");
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
