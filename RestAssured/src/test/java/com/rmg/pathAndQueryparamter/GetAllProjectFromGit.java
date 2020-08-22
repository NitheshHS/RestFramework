package com.rmg.pathAndQueryparamter;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetAllProjectFromGit {
	
	@Test
	public void getAllrepo() {
		Response res = given()
			.auth()
				.oauth2("60707cd8b10b5b95fdfa42672fe109a0574c385b")
				.pathParam("owner", "NitheshHS")
		.when()
			.get("https://api.github.com/users/{owner}/repos");
		
		res.then().log().body();
		
		List<Object> reponame=res.jsonPath().get("name");
		for(Object repo:reponame) {
			System.out.println(repo);
		}
		
		
	}
}
