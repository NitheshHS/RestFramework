package file;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
public static void main(String[] args) {
	FileOutputStream fout;
	try {
		fout = new FileOutputStream("H:\\Read.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		dout.writeInt(65);
		dout.flush();
		dout.close();
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
