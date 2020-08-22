package com.restAssured.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.restAssured.genericLib.BaseClass;
import com.restAssured.genericLib.DatabaseLib;
import com.restAssured.genericLib.IEndpoint;
import com.restAssured.pojoclassLib.Project;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Createproject extends BaseClass {
	@Test
	public void createproject() throws Throwable {
		String projectName="Amazon";
		String status="Completed";
		Project poj=new Project(projectName, "TY_0019", "Sep", "NitheshHS", status, 10);
		
		Response res = given()
			.contentType(ContentType.JSON)
			.body(poj,ObjectMapperType.JACKSON_1)
		.when()
			.post(IEndpoint.addSingleProject);
					
		res.then()
			.assertThat().statusCode(201)
			.log().all();
		
		Object actualStatus = res.jsonPath().get("msg");
		System.out.println(actualStatus);
		
		String expected = DatabaseLib.executeQueryAndGetData("select * from project", 5, projectName);
		Assert.assertEquals(expected, projectName);
		
	}

}
