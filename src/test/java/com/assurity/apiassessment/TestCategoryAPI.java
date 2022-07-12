package com.assurity.apiassessment;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import org.testng.annotations.Test;
import com.jayway.restassured.response.ValidatableResponse;

@Test
public class TestCategoryAPI {

	public void validateCategory() {
		String apiRestEndPoint = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json";

		ValidatableResponse response = given().queryParam("catalogue", "false").when().get(apiRestEndPoint).then().log()
				.all().statusCode(200);

		response.assertThat().body("Name", equalTo("Carbon credits"));
		response.assertThat().body("CanRelist", equalTo(true));
		response.assertThat().body("Promotions.findAll{it.Name=='Gallery'}.Description[0]",
				equalTo("Good position in category"));

	}
}
