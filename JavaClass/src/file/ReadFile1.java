package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFile1 {
public static void main(String[] args) {
	try {
		Reader reader=new FileReader("H:\\Write.txt");
		int read = reader.read();
		while(read!=-1)
		{
			System.out.print((char)read);
			read=reader.read();
		}
		reader.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
