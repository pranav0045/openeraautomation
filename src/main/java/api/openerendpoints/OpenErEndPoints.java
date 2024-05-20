package api.openerendpoints;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class OpenErEndPoints {

	
	public static Response getUSD(String usd)
	{
		Response response = given()
		.pathParam("usd", usd)
		
		.when()
		.get(Routes.get_url);
		return response;
	}
	
}
