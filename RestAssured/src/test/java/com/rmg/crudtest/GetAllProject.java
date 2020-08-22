package com.rmg.crudtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProject {
	@Test
	public void getAllProject() {
		Response res = RestAssured.get("http://localhost:8084/projects");
		Assert.assertEquals(res.getStatusCode(), 200);
		ValidatableResponse resval = res.then();
		resval.log().all();
		
	}
	

}
