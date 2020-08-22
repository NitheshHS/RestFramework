package com.restAssured.pojoclassLib;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class PojoSerialize {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	
	Project proj=new Project("Google", "TY_1010", "Aug", "NitheshHS", "OnGoing", 10);
	
	ObjectMapper obj=new ObjectMapper();
	obj.writeValue(new File("./Project.json"), proj);
	System.out.println("done");
	}
}
