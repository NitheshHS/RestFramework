package com.rmg.pathAndQueryparamter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class AuthTest {

	@Test
	public void test() {
		given()
			.auth().oauth2("db2c823f42c3bdd351815559da8fd20cce074131")
		.when()
			.post("http://coop.apps.symfonycasts.com/api/1291/chickens-feed")
		.then()
			.log().all();
		
	}
}
