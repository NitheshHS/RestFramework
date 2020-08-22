package com.NewApp.GenericUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseLib {
	Connection conn;
	
	public void connectDB() throws Throwable {
		Driver regdriver=new Driver();
		DriverManager.registerDriver(regdriver);
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","nithesh@1998");
		}

	public ResultSet excecuteQuery(String query) throws Throwable {
		Statement smt = conn.createStatement();
		ResultSet result = smt.executeQuery(query);
		return result;
	}
	
	public void closeConnectionDB() throws Throwable {
		conn.close();
	}
	
	
}
