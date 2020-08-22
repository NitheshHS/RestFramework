package com.rmg.Validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

public class ResponsepropertyTransfer {
	@Test
	public void transferProperty() {
		Response res = given()
			.get("http://localhost:8084/projects");
		
		ArrayList<String> project=res.jsonPath().get("projectId");
		
		for(int i=0;i<project.size();i++) {
			given()
				.pathParam("projectId", project.get(i))
				.get("http://localhost:8084/projects/{projectId}")
			.then()
				.log().all()
			.and()
				.assertThat().statusCode(200);
		}
	}
	

}
