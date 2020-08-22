package file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {
public static void main(String[] args) {
	try {
		FileInputStream fis=new FileInputStream("H:\\Read.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int i=0;
		while((i=bis.read())!=-1) {
			System.out.print((char)i);
		}
		bis.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
}
