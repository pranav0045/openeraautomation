package api.payload;

import java.util.HashMap;
import java.util.Map;

public class USDData {
	
	String result;
	String provider;
	String documentation;
	String terms_of_use;
	String time_last_update_unix;
	String time_last_update_utc;
	String time_next_update_unix;
	String time_next_update_utc;
	String time_eol_unix;
	String base_code;	
	HashMap rates[];
	
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public String getTerms_of_use() {
		return terms_of_use;
	}

	public void setTerms_of_use(String terms_of_use) {
		this.terms_of_use = terms_of_use;
	}

	public String getTime_last_update_unix() {
		return time_last_update_unix;
	}

	public void setTime_last_update_unix(String time_last_update_unix) {
		this.time_last_update_unix = time_last_update_unix;
	}

	public String getTime_last_update_utc() {
		return time_last_update_utc;
	}

	public void setTime_last_update_utc(String time_last_update_utc) {
		this.time_last_update_utc = time_last_update_utc;
	}

	public String getTime_next_update_unix() {
		return time_next_update_unix;
	}

	public void setTime_next_update_unix(String time_next_update_unix) {
		this.time_next_update_unix = time_next_update_unix;
	}

	public String getTime_next_update_utc() {
		return time_next_update_utc;
	}

	public void setTime_next_update_utc(String time_next_update_utc) {
		this.time_next_update_utc = time_next_update_utc;
	}

	public String getTime_eol_unix() {
		return time_eol_unix;
	}

	public void setTime_eol_unix(String time_eol_unix) {
		this.time_eol_unix = time_eol_unix;
	}

	public String getBase_code() {
		return base_code;
	}

	public void setBase_code(String base_code) {
		this.base_code = base_code;
	}

	public HashMap[] getRates() {
		return rates;
	}

	public void setRates(HashMap[] rates) {
		this.rates = rates;
	}

	
}
