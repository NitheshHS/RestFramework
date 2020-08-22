package com.restAssured.Test;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.restAssured.genericLib.BaseClass;
import com.restAssured.genericLib.DatabaseLib;
import com.restAssured.genericLib.IEndpoint;
import com.restAssured.pojoclassLib.Project;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateProjectTest extends BaseClass{
	@Test
	public void createproject() throws Throwable {
		String projectName="Jio";
		String status="OnGoing";
		Project pojo=new Project(projectName, "Ty_123", "Aug", "NitheshHS", status, 5);

		Response res=given()
				.contentType(ContentType.JSON)
				.body(pojo)
				.when()
				.post(IEndpoint.addSingleProject);
		System.out.println(res.getTime()+"ms");
		System.out.println(res.statusCode());
		Object message = res.jsonPath().get("msg");
		System.out.println(message);

		String expectedStatus=DatabaseLib.executeQueryAndGetData("select * from project", 5, status);
		Assert.assertEquals(status, expectedStatus);

	}

}
