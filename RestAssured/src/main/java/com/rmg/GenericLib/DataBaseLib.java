package com.rmg.GenericLib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DataBaseLib {
	Connection conn;
	Statement stmt;

	public void connectDB() throws Throwable {
		Driver driverreg=new Driver();
		DriverManager.registerDriver(driverreg);
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "nithesh@1998");
	}

	public ResultSet exceuteQuery(String query) throws Throwable {
		stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery(query);
		return result;
	}

	public String exceuteQueryAndGetdata(String query, int column,String expectedData) throws Throwable {
		boolean flag=false;
		stmt=conn.createStatement();
		ResultSet result = stmt.executeQuery(query);
		while(result.next()) {
			if(result.getString(column).equals(expectedData))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			return expectedData;
		}
		else {

			return expectedData+" is not present in database";
		}


	}

	public void closeConnectionDB() throws Throwable {
		conn.close();
	}

}
