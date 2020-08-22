package com.Nithesh.OrgTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadDataBase {
	public static void main(String[] args) {
		try {
		//Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "nithesh@1998");
		Statement smt = conn.createStatement();
		ResultSet rs = smt.executeQuery("select * from People");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
		}
		
		}
		catch(Exception e) {
			
		}
	}
 
}




