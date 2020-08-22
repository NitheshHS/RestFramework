package com.restAssured.genericLib;

import io.restassured.response.Response;

public class JsonUtils {
	
	public Object getJsonPath(Response res, String jsonPath) {
		return res.jsonPath().get(jsonPath);
		
	}

}
