package com.restAssured.Test;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.restAssured.genericLib.BaseClass;
import com.restAssured.genericLib.DatabaseLib;
import com.restAssured.genericLib.IEndpoint;
import com.restAssured.pojoclassLib.Project;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateSingleProject extends BaseClass{
	@Test
	public void createProjectAndCompairStatusInDataBas() throws Throwable {
		String projectName="Flipkart1";
		String Expectedstatus="Completed";
		Project pojo=new Project(projectName, "TY_0010", "Aug", "NitheshHS", Expectedstatus, 10);
		
		Response res = given()
			.contentType(ContentType.JSON)
			.body(pojo)
		.when()
			.post(IEndpoint.addSingleProject);
		
		res.then()
			.assertThat().statusCode(201)
		.and()
			.assertThat().header("Content-Type", Matchers.equalTo("application/json"))
			.log().all();
		
		String actualprojectname=res.jsonPath().get("projectName");
		System.out.println(actualprojectname);
		
		
		String actStatusFromDB = DatabaseLib.executeQueryAndGetData("select * from project", 5, Expectedstatus);
		
		Assert.assertEquals(actStatusFromDB, Expectedstatus);
	}

}
