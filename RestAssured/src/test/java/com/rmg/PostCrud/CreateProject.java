package com.rmg.PostCrud;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class CreateProject {
	//@Test
	public void createProject() {
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "NitheshHS");
		obj.put("createdOn", "Aug");
		obj.put("projectName", "SBI");
		obj.put("status", "Completed");
		obj.put("teamSize", 12);
		
		given()
			.contentType(ContentType.JSON)
			.body(obj.toJSONString())
		.when()
			.post("http://localhost:8084/addProject")
		.then()
			.assertThat().statusCode(201)
		.and()
			.log().all();
		
	}
	
	@Test
	public void getProject() {
		Response req = given().get("http://localhost:8084/projects");
		Object projectId = req.jsonPath().get("[0].projectId");
		
		given()
		.pathParam("projectId", projectId)
		.get("http://localhost:8084/projects/{projectId}")
		.then()
		.assertThat().statusCode(200);
		
		
	}

}
