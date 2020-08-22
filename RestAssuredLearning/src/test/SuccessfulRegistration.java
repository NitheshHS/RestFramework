package test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SuccessfulRegistration {
	@Test 
	public void sucessfullRgistration() {
		RestAssured.baseURI="http://www.goinglobal.com";
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams=new JSONObject();
		requestParams.put("Name", "Admin");
		requestParams.put("Phone", "1234567890");
		request.body(requestParams.toJSONString());
		Response response = request.post("/demo-registration-form");
		System.out.println(response.getStatusCode());
		String statuscode = response.jsonPath().get("SuccessCode");
		System.out.println(statuscode);
	}

}
