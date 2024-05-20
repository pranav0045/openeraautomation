package api.utility;

import java.util.Set;

import org.json.JSONObject;

import io.restassured.response.Response;

public class OpenErUtilities {
	
public int getCurrencyCount(Response response) {
		
		String str = response.asString();
		JSONObject jo = new JSONObject(str);
		
		JSONObject j = jo.getJSONObject("rates");

		Set<String> keys =j.keySet();
		
		int currencyPairCount = keys.size();
		return currencyPairCount;
	}

	public boolean getResponseTime(Response response) {
		int sec = (int) (response.getTime()/1000);
		boolean isdelayed = false;
		if(sec>3)
			isdelayed = true;
		return isdelayed;
	}

}
