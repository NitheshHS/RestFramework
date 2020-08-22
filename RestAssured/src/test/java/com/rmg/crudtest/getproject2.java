package com.rmg.crudtest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;


import static io.restassured.RestAssured.*;

public class getproject2 {
	//@Test
	public void getAllProject() {
		given()
			.get("http://localhost:8084/projects")
		.then()
			.assertThat().statusCode(200)
		.and()
			.assertThat().contentType(ContentType.JSON)
		.and()
			.log().all();
		
	}
	@Test
	public void getallProject() {
		when()
			.get("http://localhost:8084/projects")
		.then()
			.assertThat().statusCode(200)
		.and()
			.assertThat().contentType(ContentType.JSON)
		.and()
			.log().all();
		
	}

}
