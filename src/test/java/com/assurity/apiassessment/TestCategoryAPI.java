package com.assurity.apiassessment;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import org.testng.annotations.Test;
import com.jayway.restassured.response.ValidatableResponse;

import groovy.lang.Category;

@Test(groups="smoke",description = "This test case validates GET category request by sending category ID.")
@Category()
public class TestCategoryAPI extends BaseTest {

	public void validateCategoryDetails() {

		ValidatableResponse response;
		String categoryId = "6327";
		
		// Get a response by sending a GET request for a given category ID.
		response = given().queryParam("catalogue", "false").when()
				.get(base_URI + "Categories/" + categoryId + "/Details.json").then().log().all().statusCode(200);
		
		// Validate the expected values of the response.
		response.assertThat().body("Name", equalTo("Carbon credits")).assertThat().body("CanRelist", equalTo(true))
				.assertThat()
				.body("Promotions.findAll{it.Name=='Gallery'}.Description[0]", equalTo("Good position in category"));

	}
}
