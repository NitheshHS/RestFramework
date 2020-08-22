package com.restAssured.genericLib;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

public class BaseClass {
	@BeforeSuite
	public void configBS() {
		baseURI="http://localhost:8084";
		port=8084;
		DatabaseLib.connectToDB();
		
	}
	
	@AfterSuite
	public void configAS() throws SQLException {
		DatabaseLib.closeDb();
	}

}
