package com.project.dummyapi;

import org.hamcrest.core.StringContains;

import io.restassured.RestAssured;

public class DeleteRequest {

	public static void main(String[] args) {

		String URL = "https://dummy.restapiexample.com/api/v1";
		RestAssured.baseURI = URL;
		
		String deleteSuccess = "Successfully! Record has been deleted";
		
		RestAssured
		.given()
		.when()
		.delete("/delete/2")
		.then()
		.statusCode(200)
		.body(StringContains.containsString(deleteSuccess));
	}

}
