package com.rmg.updateproject;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Updateproject {
@Test
public void update() {
	JSONObject obj=new JSONObject();
	obj.put("createdBy", "Nithesh HS");
	obj.put("createdOn", "17/08/2020");
	obj.put("projectId", "TY_PROJ_002");
	obj.put("projectName", "ICICI");
	obj.put("status", "Completed");
	obj.put("teamSize", "1000");
	RequestSpecification reqs = RestAssured.given();
	reqs.contentType(ContentType.JSON);
	reqs.pathParam("projectId", "TY_PROJ_002");
	Response res = reqs.when().put("http://localhost:8084/projects/{projectId}");
	System.out.println(res.getStatusCode());
	System.out.println(res.getContentType());
	System.out.println(res.getStatusLine());
	ValidatableResponse val = res.then();
	val.assertThat().contentType(ContentType.JSON);
	
}
}
