package day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test {
public static void main(String[] args) {
	try {
		File file=new File("H:/ELF-5 selenium/JavaClass/src/day5/db.properties");
		FileReader r=new FileReader(file);
		Properties p=new Properties();
		p.load(r);
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
