package com.rmg.PostCrud;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Sample_project {
@Test
public void createProject() {
	JSONObject obj=new JSONObject();
	obj.put("createdBy", "Google");
	obj.put("createdOn", "Aug");
	obj.put("projectName", "Webdriver");
	obj.put("status", "Completed");
	obj.put("teamSize", "100");
	
	RequestSpecification req = RestAssured.given();
	req.contentType(ContentType.JSON);
	req.body(obj.toJSONString());
	Response post = req.when().post("http://localhost:8084/addProject");
	System.out.println(post.getStatusCode());
	System.out.println(post.getContentType());
	System.out.println(post.getTime());
	System.out.println(post.asString());
	ValidatableResponse val = post.then();
	val.assertThat().statusCode(201);
	val.contentType(ContentType.JSON);
}
}
