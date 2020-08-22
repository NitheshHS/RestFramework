package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
public static void main(String[] args) {
	FileOutputStream fos=null;
	File file=null;
	String mycontent="This is my data which is need to be written into file";
	
	try
	{
		file=new File("H:\\writefile.txt");
		fos=new FileOutputStream(file);
		if(!file.exists())
		{
			file.createNewFile();
		}
	
	byte[] byteArray = mycontent.getBytes();
	fos.write(byteArray);
	fos.flush();
	System.out.println("File written successfully");
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	finally {
		try
		{
			if(fos!=null)
				fos.close();
		}
		catch(IOException e)
		{
			System.out.println("Error while closing the file");
		}
	}

	
}
}
