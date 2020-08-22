package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileDemo {
public static void main(String[] args) {
	String content=" This is my new content to append to specified file";
	File file=new File("H:\\writefile.txt");
	if(!file.exists())
	{
		try {
			file.createNewFile();
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.append(content);
			bw.close();
			System.out.println("File append succesfull");
		} catch (IOException e) {
			System.out.println("Exception occured");
			e.printStackTrace();
			
		}
	}
}
}
