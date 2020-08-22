package test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class HassanWeather {
	@Test
	public void getWeather() {
		RestAssured.baseURI="https://www.timeanddate.com/weather/india/";
		RequestSpecification http = RestAssured.given();
		Response response = http.request(Method.GET, "hassan/ext");
		ResponseBody body = response.body();
		System.out.println(body.asString());
		
	}
	

}
