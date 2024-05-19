package DButils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnectio {
	
	//here Connection is return type and openConnection is method
	public static Connection openConnection()throws SQLException,ClassNotFoundException
	{
		//1.load drivers(its optional in 1.8 verson or above)
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sql=("jdbc:mysql://localhost:3306/mohit");
		//2.get connection
		return DriverManager.getConnection(sql,"mohitgupta","Br03b1931@");
		
	}

}
