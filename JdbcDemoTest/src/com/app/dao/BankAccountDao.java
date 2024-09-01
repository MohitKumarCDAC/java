package com.app.dao;

import java.sql.SQLException;

public interface BankAccountDao {
//here we create abstract and final methods
	//and use this Dao implementatiion
	String transferFunds(int srcid,int destid,double amount) throws SQLException;
	}
