package com.restAssured.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.restAssured.genericLib.BaseClass;
import com.restAssured.genericLib.DatabaseLib;
import com.restAssured.genericLib.IEndpoint;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

public class GetAllproject extends BaseClass{
	
	@Test
	public void getAllProjectTest() throws Throwable {
		Response res = given()
			.get(IEndpoint.getAllProject);
		ArrayList<String> projID = res.jsonPath().get("projectId");
		for(int i=0;i<projID.size();i++) {
			System.out.println(projID.get(i));
		}
		
		for(String proj:projID) {
			given()
				.pathParam("projectId", proj)
			.when()
				.get(IEndpoint.getSingleProject)
			.then()
				.assertThat()
					.statusCode(200)
			.and()
				.log().all();
				
				
			String expectedProjectid = DatabaseLib.executeQueryAndGetData("select * from project", 1, proj);
			Assert.assertEquals(proj, expectedProjectid);
		}
		
		
	}

}
