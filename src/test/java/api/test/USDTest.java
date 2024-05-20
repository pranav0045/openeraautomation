package api.test;

import java.util.Set;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import api.openerendpoints.OpenErEndPoints;
import api.utility.OpenErUtilities;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class USDTest {
	
	OpenErUtilities util;
	@BeforeClass
	public void setupData()
	{
		OpenErUtilities util = new OpenErUtilities();
	}		
	
	@Test(priority=1)
	public void testGetCall() 
	{
	Response response = OpenErEndPoints.getUSD("usd");
	response.then().log().all();
	
	SoftAssert sft = new SoftAssert();
	
	sft.assertEquals(response.statusCode(), 200);
			
	sft.assertEquals(response.statusLine().toString().contains("OK"), true);
	
	JsonSchemaValidator.matchesJsonSchemaInClasspath("./jsonTemplates/schema.json");
	
	sft.assertEquals(getResponseTime(response), false);
		
	sft.assertEquals(getCurrencyCount(response), 162);
	
	sft.assertAll();
		
	}
	
 private int getCurrencyCount(Response response) {
		
		String str = response.asString();
		JSONObject jo = new JSONObject(str);
		
		JSONObject j = jo.getJSONObject("rates");

		Set<String> keys =j.keySet();
		
		int currencyPairCount = keys.size();
		return currencyPairCount;
	}

	private boolean getResponseTime(Response response) {
		int sec = (int) (response.getTime()/1000);
		boolean isdelayed = false;
		if(sec>3)
			isdelayed = true;
		return isdelayed;
	}

	
}
