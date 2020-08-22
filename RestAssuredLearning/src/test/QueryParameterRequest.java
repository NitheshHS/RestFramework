package test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class QueryParameterRequest {
	@Test
	public void QueryTest() {
		RestAssured.baseURI="https://samples.openweathermap.org/data/2.5/";
		RequestSpecification httpConn = RestAssured.given();
		Response response = httpConn.queryParam("q", "London,UK").queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").get("/weather");
		String body = response.getBody().asString();
		System.out.println("Body: "+body);
		int statuscode=response.getStatusCode();
		System.out.println("status code :"+statuscode);
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		System.out.println(response.header("Content-Type"));
		System.out.println(response.header("server"));
		System.out.println(response.header("Content-Encoding"));
		
		
	}

}
