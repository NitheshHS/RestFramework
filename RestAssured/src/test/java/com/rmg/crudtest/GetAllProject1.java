package com.rmg.crudtest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProject1 {
	@Test
	public void allProject() {
		Response res=RestAssured.get("http://localhost:8084/projects");
		ValidatableResponse validate = res.then();
		validate.assertThat().statusCode(200);
		validate.assertThat().contentType(ContentType.JSON);
		System.out.println(res.getStatusCode());
	}
}
