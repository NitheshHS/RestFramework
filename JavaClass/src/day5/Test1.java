package day5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test1 {
public static void main(String[] args) {
	Properties prop=new Properties();
	prop.setProperty("name", "Nithesh");
	prop.setProperty("Email", "nitheshsgowda4.ng@gmail.com");
	try {
		prop.store(new FileWriter("file.properties"), "updated");
		System.out.println("sucess");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
