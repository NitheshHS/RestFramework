package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
public static void main(String[] args) {
	try {
		FileReader fr=new FileReader("H:\\filewriter.txt");
		int i=0;
		while((i=fr.read())!=0)
		{
			System.out.print((char)i);
		}
		fr.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
