package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SeqWrite {
public static void main(String[] args) {
	try {
		FileInputStream in1=new FileInputStream("H:\\Read.txt");
		FileInputStream in2=new FileInputStream("H:\\Read.txt");
		SequenceInputStream seq=new SequenceInputStream(in1, in2);
		File file=new File("H:\\Write.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream fout=new FileOutputStream(file);
		int i=0;
		while((i=seq.read())!=-1)
		{
			fout.write((char)i);
		}
		System.out.println("Success");
		fout.close();
		seq.close();
		in2.close();
		in1.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
