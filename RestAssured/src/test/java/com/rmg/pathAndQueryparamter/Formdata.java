package com.rmg.pathAndQueryparamter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Formdata {
	
	@Test
	public void formData() {
		String token=given()
			.formParam("client_id", "RMG")
			.formParam("client_secret", "aa61faf06a518f56f737d065af4f4bf0")
			.formParam("grant_type", "client_credentials")
		.when()
			.post("http://coop.apps.symfonycasts.com/token")
		.jsonPath().get("access_token");
		
		given()
			.auth().oauth2(token)
		.when()
			.post("http://coop.apps.symfonycasts.com/api/1291/chickens-feed")
		.then()
			.log().all();
	}

}
