package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {
public static void main(String[] args) {
	try {
		FileInputStream input1=new FileInputStream("H:\\Read.txt");
		FileInputStream input2=new FileInputStream("H:\\Read.txt");
		SequenceInputStream seq=new SequenceInputStream(input1, input2);
		int i=0;
		while((i=seq.read())!=-1) {
			System.out.print((char)i);
			
		}
		System.out.println();
		seq.close();
		input2.close();
		input1.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
