import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import static DButils.TestConnectio.*;

public class TestClass {

	public static void main(String[] args) {
	//load the driver
		try {
		
			Connection con=openConnection();
			Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from test1");
		
		while(rs.next())
		{
			//display all data we use select query
			System.out.println("Id:"+rs.getInt(1)+":"+"Name:"+rs.getString(2)+":"+"City:"+rs.getString(3)+":"+"Age:"+rs.getInt(4));
			
		}
		con.close();
		stmt.close();
		
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
