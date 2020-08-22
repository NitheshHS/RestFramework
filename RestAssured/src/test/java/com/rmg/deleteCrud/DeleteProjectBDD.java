package com.rmg.deleteCrud;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DeleteProjectBDD {
@Test
public void deleteProject() {
	given()
		.pathParam("ProjectId", "TY_PROJ_004")
	.when()
		.delete("http://localhost:8084/projects/{ProjectId}")
	.then()
		.assertThat().statusCode(204)
	.and()
		.assertThat().contentType(ContentType.JSON)
		.log().all();
}
}
