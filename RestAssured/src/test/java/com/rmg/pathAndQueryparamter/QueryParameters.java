package com.rmg.pathAndQueryparamter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameters {
@Test
public void query() {
	
	given()
		.auth().basic("NitheshHS", "nithesh@1998")
		.pathParam("owner", "NitheshHS")
		.pathParam("repo", "vTiger")
	.when()
		.get("https://api.github.com/repos/{owner}/{repo}")
	.then()
		.assertThat().statusCode(200)
		.log().all();
}
}
