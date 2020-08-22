package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleTest {
	@Test
	public void getWeather() {
		RestAssured.baseURI="https://www.toolsqa.com/rest-assured";
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response=httpRequest.request(Method.GET, "/validate-response-status-using-rest-assured/");
		//status code of an application
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
		String statusline = response.getStatusLine();
		System.out.println(statusline);
		//String body = response.getBody().asString();
		//System.out.println(body);
		
		//headers
		String contenttype = response.header("Content-Type");
		String server = response.header("Server");
		String encoding = response.header("content-Encoding");
		System.out.println(contenttype);
		System.out.println(server);
		System.out.println(encoding);
	}

}
