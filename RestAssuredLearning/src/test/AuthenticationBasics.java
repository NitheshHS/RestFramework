package test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthenticationBasics {
	@Test
	public void test() {
		RestAssured.baseURI="https://demoqa.com/swagger/#/BookStore/BookStoreV1BooksGet";
		RequestSpecification httpconn = RestAssured.given();
		Response response = httpconn.get();
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.body().asString());
	}

}
