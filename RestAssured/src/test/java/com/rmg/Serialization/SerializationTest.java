package com.rmg.Serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class SerializationTest {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
	
	Project proj=new Project("NitheshHS", "Aug", "Ty_005", "CanaraBank", "Completed", 150);
	
	ObjectMapper obj=new ObjectMapper();
	obj.writeValue(new File("./Projectinf.json"), proj);
	System.out.println("done");
	}
}
