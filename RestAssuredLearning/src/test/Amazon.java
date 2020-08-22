package test;

import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Amazon {
	@Test
	public void amazonTest() {
		RestAssured.baseURI="https://www.amazon.in";
		RequestSpecification httpconn = RestAssured.given();
		 Response response = httpconn.queryParam("k", "dell+laptop").queryParam("crid", "3TACEUTPFEHT2").queryParam("sprefix", "dell%2Caps%2C632")
		.queryParam("ref", "nb_sb_ss_i_1_4").get("/s");
		int statuscode=response.getStatusCode();
		System.out.println("statuscode :"+statuscode);
		String statusline = response.getStatusLine();
		System.out.println(statusline);
		Headers header = response.getHeaders();
		Iterator<Header> itr = header.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
