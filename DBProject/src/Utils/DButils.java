package Utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {
	//first we make a method of connection
	//method return type is Connection
	public static Connection openConnection()throws IOException,SQLException,ClassNotFoundException
	{
		//load drive
		Class.forName("com.mysql.cj.jdbc.Driver");
		//url
		String url="jdbc:mysql://localhost:3306/mohit";
		return DriverManager.getConnection(url,"mohitgupta","Br03b1931@");
		
	}

}
