package com.rmg.Validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

public class ExtractjsonBody {
	//@Test
	public void extractTest() {
		String res = given()
			.get("http://localhost:8084/projects")
			.jsonPath().get("[0].projectId");
		System.out.println(res);
			
		
		
	}
	//@Test
	public void extractList() {
		Response res = given()
			.get("http://localhost:8084/projects");
		ArrayList<String> lst = res.jsonPath().get("projectId");
		ArrayList<String> lst2=res.jsonPath().get("projectName");
		
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i)+"==>"+lst2.get(i));
		}
	}
	
	@Test
	public void validateJsonPath() {
		String project="Orangehrm";
		boolean flag=false;
		Response res = given()
			.get("http://localhost:8084/projects");
		ArrayList<String> lst=res.jsonPath().get("projectName");
		
		for(int i=0;i<lst.size();i++)
		{
			if(project.equals(lst.get(i))) {
				flag=true;
				break;
			}
		}
		if(flag) {
		System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
			Assert.assertTrue(false);
		}
	}
	
	

}
