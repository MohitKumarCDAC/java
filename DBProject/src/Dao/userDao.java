package Dao;

import java.sql.SQLException;

import user.User;

public interface userDao {
	User userAuthentication(String email,String password)throws SQLException;

}
