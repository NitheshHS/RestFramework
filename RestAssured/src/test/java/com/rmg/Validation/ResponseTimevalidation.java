package com.rmg.Validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimevalidation {
	@Test
	public void validateTime() {
		
	long time = when()
			.get("http://localhost:8084/projects")
			.timeIn(TimeUnit.MILLISECONDS);
	System.out.println(time+"ms");
	
	given()
		.get("http://localhost:8084/projects")
	.then()
		.assertThat().time(Matchers.lessThan(2L),TimeUnit.MILLISECONDS);
	
	}
	

}
