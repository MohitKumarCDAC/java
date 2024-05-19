import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import static DButils.TestConnectio.*;
public class CreateQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//openConnection is a method
			Connection con=openConnection();
			Statement stmt=con.createStatement();
		
			//create a table
			//String sql="create table test2(tId int(20) primary key auto_increment,tName varchar(100) not null,tCity varchar(50) not null)";
			String sql="alter table test1 add column Age int";
			stmt.executeUpdate(sql);
			//System.out.println("table created in database...");
			System.out.println("Table Altered");
			con.close();
			
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
