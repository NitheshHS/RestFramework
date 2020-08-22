package file;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdOutputStreamExample {
public static void main(String[] args) {
	try {
		FileOutputStream fos=new FileOutputStream("H:\\Read.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String s="This is BufferedOutputStream Example Program";
		byte[] by = s.getBytes();
		bos.write(by);
		bos.flush();
		bos.close();
		fos.close();
		System.out.println("Successfully written...");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
