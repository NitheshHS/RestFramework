package file;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
public static void main(String[] args) {
	byte[] buf= {36,37,38,39};
	ByteArrayInputStream bin=new ByteArrayInputStream(buf);
	
	int k=0;
	while((k=bin.read())!=-1)
	{
		int ch = (char)k;
		System.out.println("ASCII value of: "+k+" and corresponding value is: "+(char)ch);
	}
	try {
		bin.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
