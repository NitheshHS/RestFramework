package com.rmg.deleteCrud;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DeleteProject {
@Test
public void deleteProjec() {
	
	RequestSpecification res = RestAssured.given();
	res.pathParam("projectId", "TY_PROJ_005");
	
	
	Response req = res.when().delete("http://localhost:8084/projects/{projectId}");
	
	System.out.println(req.getStatusCode());
	System.out.println(req.asString());
	
	ValidatableResponse val = req.then();
	val.assertThat().statusCode(204);
	
	
	
	
}
}
