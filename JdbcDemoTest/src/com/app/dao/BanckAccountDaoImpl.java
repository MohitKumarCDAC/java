package com.app.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.management.Descriptor;

import static com.app.utils.DBUtils.*;
import java.sql.*;

public class BanckAccountDaoImpl implements BankAccountDao{

	private Connection con;
	//here we CallableStatement-->insert the procedure of mysql
	private CallableStatement clstmt;

	//define constructor
	public BanckAccountDaoImpl() throws SQLException{
		//connection from dbutils
		con=openConnection();
		//callableStatement
		//in stored procedure 3 input parameters and 2 output parameters
		clstmt=con.prepareCall("{call transfer_funds_proc(?,?,?,?,?)}");
		//registerOutParameters() of CallableStatement;
		clstmt.registerOutParameter(4, Types.DOUBLE);
		clstmt.registerOutParameter(5, Types.DOUBLE);
		
		System.out.println("Account Dao Created");

	}
//here we define in parametrs
	@Override
	public String transferFunds(int srcid, int destid, double amount) throws SQLException {
		
		//set In parameters
		clstmt.setInt(1, srcid);
		clstmt.setInt(2, destid);
		clstmt.setDouble(3, amount);
		
		//execute a procedure
		clstmt.execute();
		
		//get out parameter
		double srcbal=clstmt.getDouble(4);
		double desbal=clstmt.getDouble(5);
		System.out.println(srcbal);
		System.out.println(desbal);
		
		//get result from cst
		return "Update Src Balance"+srcbal+"dest bal"+
		desbal;
		
	
		}
public void cleanUp()throws SQLException{
	if(clstmt!=null)
		clstmt.close();
	if(con!=null)
		con.close();
	System.out.println("account dao cleaned up....");
}




}
