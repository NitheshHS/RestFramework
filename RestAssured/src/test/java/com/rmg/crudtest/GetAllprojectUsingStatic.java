package com.rmg.crudtest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAllprojectUsingStatic {

	@Test
	public void getAllproject() {
		given()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().statusCode(200)
		.assertThat().statusLine("HTTP/1.1 200 ")
		.and()
		.assertThat().contentType(ContentType.JSON)
		.and()
		.log().all();
	}



}
