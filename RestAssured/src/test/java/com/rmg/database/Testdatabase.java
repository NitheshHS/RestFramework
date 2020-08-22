package com.rmg.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;
		
import com.mysql.jdbc.Driver;

public class Testdatabase {
	@Test
	public void testDB() throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "nithesh@1998");
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery("select * from project");
		while(result.next()) {
			System.out.println(result.getString(1)+"|"+result.getString(2)+"|"+result.getString(3)+"|"+
		result.getString(4)+"|"+result.getString(5)+"|"+result.getString(6));
			System.out.println("==================================================================================");
		}
		
	}

}
