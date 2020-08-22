package com.rmg.PostCrud;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateprojectBDD {
@Test
public void createProject() {
	JSONObject obj=new JSONObject();
	obj.put("createdBy", "Microsoft");
	obj.put("createdOn", "Aug");
	obj.put("projectName", "Windows");
	obj.put("status", "Completed");
	obj.put("teamSize", "100");
	
	given()
		.contentType(ContentType.JSON)
		.body(obj.toJSONString())
	.when()
		.post("http://localhost:8084/addProject")
	.then()
		.assertThat().contentType(ContentType.JSON)
	.and()
		.assertThat().statusCode(201)
		.log().all();
	
}
}
