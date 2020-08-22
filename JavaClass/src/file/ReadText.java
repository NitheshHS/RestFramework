package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadText {
public static void main(String[] args) {
	try {
		File file=new File("H:\\Read.txt");
		FileInputStream fis=new FileInputStream(file);
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
	} catch (IOException ei) {
		ei.printStackTrace();
	}
	
}
}
