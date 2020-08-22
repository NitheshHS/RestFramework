package com.rmg.Serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class DeserializationTest {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper obj=new ObjectMapper();
		Project proj=obj.readValue(new File("./Projectinf.json"), Project.class);
		System.out.println(proj.projectName);
	}

}
