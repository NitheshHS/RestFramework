package file;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
public static void main(String[] args) {
	File file=new File("H:\\new file.txt");
	try {
		boolean fvar = file.createNewFile();
		if(fvar) {
		System.out.println("new File is created in provided location");
		}
		else
		{
			System.out.println("file creation failed");
		}
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
}
