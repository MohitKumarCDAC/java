package com.app.dao;

import static com.app.utils.DBUtils.closeconnection;
import static com.app.utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.entities.User;

public class UserDaoImpl implements UserDao{
	//state
	private Connection con;
	private PreparedStatement pst1,pst2,pst3,pst4,pst5;
	
	//default constructor of dao layer
	public UserDaoImpl() throws SQLException{
		//get connection from DBUtils
		con=openConnection();
		//pst1 signin
		pst1=con.prepareStatement("select UserId,FirstName,LastName,email,status,role from user1 where email=? and password=?");
		//pst2 get details
		pst2=con.prepareStatement("select * from user1 where role='voter' and dob between ? and ?");
		
//		pst3 voter registration
//		int userId, String firstName, String lastName, String email, String password, Date dob, boolean status,
//		String role
		
		pst3=con.prepareStatement("insert into user1 values(default,?,?,?,?,?,?,?)");
		
		//pst4 change password
		pst4=con.prepareStatement("update user1 set password=? where email =? and password=? and role='voter'");
		
		System.out.println("userDao Created");
	}
	
	public User signIn(String email,String password)throws SQLException {
		//1.set IN parameters
		pst1.setString(1, email);
		pst1.setString(2, password);
		//2.execute query
		try (ResultSet rst=pst1.executeQuery()){
			if(rst.next())//if true
			{
//				return new User(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),
//						rst.getDate(6),rst.getBoolean(7),rst.getString(8));
				return new User(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getBoolean(5),rst.getString(6));
			}
			return null;
		}
	}
	
	public List<User> getUserDetails(Date begin,Date end)throws SQLException{
		//create empty list
		List<User> user=new ArrayList<User>();
		//set in parameters
		pst2.setDate(1, begin);
		pst2.setDate(1, end);
		//exec query
		try (ResultSet rst=pst2.executeQuery()){
			while(rst.next())
			{
				user.add(new User(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),
						rst.getDate(6),rst.getBoolean(7),rst.getString(8)));
			}
			return user;
		}
	}
	
	public String voterRegistration(User newVoter)throws SQLException {
		//1.set in parameters
		pst3.setString(1, newVoter.getFirstName());
		pst3.setString(2, newVoter.getLastName());
		pst3.setString(3, newVoter.getEmail());
		pst3.setString(4, newVoter.getPassword());
		pst3.setDate(5, newVoter.getDob());
		pst3.setBoolean(6, newVoter.isStatus());
		pst3.setString(7, newVoter.getRole());
		
		//exec update
		int rows=pst3.executeUpdate();
		if(rows==1)
			return "VoterRegistered";
		return "Voter Registration failed!";
	}
	public 	String changePassword(String email,String oldpwd,String newpwd) throws SQLException{
		//set in parameters
		pst4.setString(1, newpwd);
		pst4.setString(2, email);
		pst4.setString(3, oldpwd);
		
		//exec update DML
		int rows=pst4.executeUpdate();
		if(rows==1)
			return "Data Updated!";
		return "Changing password failed(invalid oldpassword or email)";
	}
	
	public String deleteVoterDetails(int voterId) throws SQLException{
		return null;
	}
	
	// add clean up method to close DB resources
		public void cleanUp() throws SQLException {
			System.out.println("user dao cleaned up");
			if (pst1 != null)
				pst1.close();
			if (pst2 != null)
				pst2.close();
			if (pst3 != null)
				pst3.close();
			if (pst4 != null)
				pst4.close();
			closeconnection();
		}

}
