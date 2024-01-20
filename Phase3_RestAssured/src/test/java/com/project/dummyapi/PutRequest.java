package com.project.dummyapi;

import org.hamcrest.core.StringContains;
import io.restassured.RestAssured;

public class PutRequest {

	public static void main(String[] args) {
		
		String URL = "https://dummy.restapiexample.com/api/v1";
		RestAssured.baseURI = URL;
		
		String postPayload = "{\"id\":\"1\",\"employee_name\":\"Ronaldo Nazario\",\"employee_age\":\"33\"}";
		String postSuccess = "Successfully! Record has been updated";
			
		RestAssured
		.given()
		.when()
		.body(postPayload)
		.put("/update/1")
		.then()
		.log().all()
		.statusCode(200)
		.body(StringContains.containsString(postSuccess));
	}
	
}