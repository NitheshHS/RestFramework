package file;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
public static void main(String[] args) {
	try {
		FileOutputStream in1=new FileOutputStream("H:\\Read.txt");
		FileOutputStream in2=new FileOutputStream("H:\\Read.txt");
		ByteArrayOutputStream by=new ByteArrayOutputStream();
		String str="ByteArrayOutputStream will write 2  or more files";
		byte[] arr=str.getBytes();
		by.write(arr);
		by.writeTo(in1);
		by.writeTo(in2);
		by.flush();
		by.close();
		System.out.println("Success");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
