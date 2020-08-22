
package com.rmg.crudtest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class GetAllRepo {
	@Test
	public void getAllrepo() {
		RequestSpecification req = RestAssured.given();
		req.pathParam("owner", "NitheshHS");
		req.pathParam("repo", "OneDayCart");
		req.get("https://api.github.com//repos/{owner}/{repo}");
		
		
		
	}

}
