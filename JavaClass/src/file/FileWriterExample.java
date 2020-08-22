package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
public static void main(String[] args) {
	try {
		FileWriter fw=new FileWriter("H:\\filewriter.txt");
		 fw.write("I love my country");
		 fw.append(" india ");
		 System.out.println("success");
		 fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
