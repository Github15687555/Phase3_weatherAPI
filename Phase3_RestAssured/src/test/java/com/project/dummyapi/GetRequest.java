package com.project.dummyapi;

import io.restassured.RestAssured;
import static org.hamcrest.core.IsEqual.equalTo;
import org.hamcrest.core.StringContains;

public class GetRequest {

	public static void main(String[] args) {

		String URL = "https://dummy.restapiexample.com/api/v1/";
		RestAssured.baseURI = URL;
		
		String getSuccess = "Successfully! All records has been fetched";
		String getSingleSuccess = "Michael Silva";

		RestAssured
		.given()
		.when()
		.get("/employees")
		.then()
		.statusCode(200)
		.body(StringContains.containsString(getSuccess));
		
		RestAssured
		.given()
		.when()
		.get("/employee/16")
		.then()
		.statusCode(200)
		.body("data.employee_name", equalTo(getSingleSuccess));

	}
}
