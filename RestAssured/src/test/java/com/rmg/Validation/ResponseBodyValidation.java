package com.rmg.Validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ResponseBodyValidation {
	
	@Test
	public void validateBody() {
		given()
			.get("http://localhost:8084/projects")
		.then()
			.assertThat().body("[0].projectName", Matchers.equalTo("Orangehrm"))
		.and()
			.assertThat().body("[1].projectId", Matchers.containsString("TY"))
		.and()
			.assertThat().body("projectName", Matchers.hasItems("Orangehrm","SBI"));
	}

}
