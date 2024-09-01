package com.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	private static Connection connection;
	//we vreate static all variables its constant does not changed
	private static final String DB_url;
	private static final String user;
	private static final String password;
	
	static {
		DB_url="jdbc:mysql://localhost/mohit";
		user="mohitgupta";
		password="Br03b1931@";
	}
	
	public static Connection openConnection() throws SQLException {
		connection=DriverManager.getConnection(DB_url,user,password);
		
		return connection;
	}
	
	public static void closeconnection() throws SQLException{
		if(connection!=null)
		{
			connection.close();
			System.out.println("DataBase not connected!");
		}
	}
	
	

}
