package com.rmg.Validation;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ResponseHeaderValidation {
	@Test
	public void validateHeader() {
		given()
			.get("http://localhost:8084/projects")
		.then()
			.log().all()
		.and()
			.contentType(ContentType.JSON)
		.and()
			.header("Transfer-Encoding", "chunked");
		
			
	}

}
