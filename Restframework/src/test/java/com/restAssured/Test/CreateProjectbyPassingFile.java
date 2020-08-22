package com.restAssured.Test;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import com.restAssured.genericLib.IEndpoint;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

public class CreateProjectbyPassingFile {
	@Test
	public void createSingleProject() throws IOException {
		FileInputStream fis=new FileInputStream("./Project.json");
		given()
			.contentType(ContentType.JSON)
			.body(IOUtils.toByteArray(fis),ObjectMapperType.JACKSON_1)
		.when()
			.post(IEndpoint.addSingleProject)
		.then()
			.assertThat().statusCode(201);
			
	}

}
