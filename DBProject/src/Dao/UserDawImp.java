package Dao;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import static Utils.DButils.openConnection;



import user.User;

public class UserDawImp implements userDao {
	private Connection con;
	private PreparedStatement pstmt;
	
	public UserDawImp()throws SQLException, ClassNotFoundException, IOException
	{
		//get data base connection
		con=openConnection();
		pstmt=con.prepareStatement("select * from users where email=? and Password=?");
		System.out.println("User Dao created:");
	}

	@Override
	public User userAuthentication(String email, String password) throws SQLException {
		//1. set In parameters
		pstmt.setString(1, email);
		pstmt.setString(2, password);
		//execute Query
		
		try(ResultSet rst=pstmt.executeQuery()) {
			if(rst.next())
			{
				/*
				 * int userId, String firstName, String lastName, String email, 
				 * String password, double regAmount,
			Date regDate, String role
				 */
				return new User(rst.getInt(1), rst.getString(2), rst.getString(3),
                         email, password, rst.getDouble(6),rst.getDate(7),rst.getString(8));
			}
			
		}
		return null;
	}
	//clean up -- closing of DB resources
		public void cleanUp() throws SQLException
		{
			if(pstmt != null)
				pstmt.close();
			if(con != null)
				con.close();
			System.out.println("user dao cleaned up !");
		}


}
