//package com.rmg.Serialization;
//
//import org.testng.annotations.Test;
//
//import io.restassured.http.ContentType;
//import io.restassured.mapper.ObjectMapperType;
//
//import static io.restassured.RestAssured.*;
//
//public class CreateProjectBDD {
//	@Test
//	public void createProject() {
//		Project proj=new Project("NitheshHS", "July", "TY_005", "CanaraBank", "Completed", 10);
//		given()
//			.contentType(ContentType.JSON)
//			.body(proj,ObjectMapperType.JACKSON_1)
//		.when()
//			.post("http://localhost:8084/addProject")
//		.then()
//			.assertThat().statusCode(201)
//			.log().body(true);
//		
//			
//	}
//	@Test
//	 public void createProjecttes5() {
//	  
//	      Map<String, Object> map = new HashMap();
//	      map.put("createdBy", "deepak");
//	      map.put("createdOn", "aug");
//	      map.put("projectName", "BinBang");
//	      map.put("status", "Completed");
//	      map.put("teamSize", 12);
//	      
//	        given()
//	           .contentType(ContentType.JSON)
//	           .body(map)
//	       .when()
//	           .post("http://localhost:8084/addProject")
//	          .then()
//	              .assertThat().statusCode(201)
//	              .and()
//	              .assertThat().contentType(ContentType.JSON)
//	              .and()
//	                .log().all();
//	           
//	      
//	   
//	 }//@Test
// public void createProjecttest_4() throws IOException {
//  
//         ProjectPOJO pObj = new ProjectPOJO("vodafone", "aug", "deepak", "Completed", 12);
//  
//  
//        given()
//           .contentType(ContentType.JSON)
//           .body(pObj,ObjectMapperType.JACKSON_1)
//       .when()
//           .post("http://localhost:8084/addProject")
//       .then()
//           .assertThat().statusCode(201)
//           .and()
//           .assertThat().contentType(ContentType.JSON)
//           .and()
//             .log().all();
//   
//   
// }//@Test
// public void createProjecttest_3() throws IOException {
//	  
//     ProjectPOJO pObj = new ProjectPOJO("vodafone_1", "aug", "deepak", "Completed", 12);
//
//
//    given()
//       .contentType(ContentType.JSON)
//       .body(pObj)
//   .when()
//       .post("http://localhost:8084/addProject")
//   .then()
//       .assertThat().statusCode(201)
//       .and()
//       .assertThat().contentType(ContentType.JSON)
//       .and()
//         .log().all();
// }
////@Test
//public void createProjecttest_2() throws IOException {
//
//FileInputStream fis = new FileInputStream(new File("./project.json"));
//
//
//      given()
//         .contentType(ContentType.JSON)
//         .body(IOUtils.toByteArray(fis))
//     .when()
//         .post("http://localhost:8084/addProject")
//     .then()
//         .assertThat().statusCode(201)
//         .and()
//         .assertThat().contentType(ContentType.JSON)
//         .and()
//           .log().all();
//}
