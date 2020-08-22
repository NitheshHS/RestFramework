package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
public static void main(String[] args) {
	File file=new File("H:\\writefile.txt");
	FileInputStream fis=null;
	BufferedInputStream bis=null;
	try
	{
		fis=new FileInputStream(file);
		bis=new BufferedInputStream(fis);
		while(bis.available()>0)
		{
			System.out.print((char)bis.read());
		}
	}
	catch(FileNotFoundException f)
	{
		System.out.println("File not found");
	} catch (IOException e) {
		
		e.printStackTrace();
		System.out.println("IO Exception");
	}
	finally {
		try
		{
			if(bis!=null && fis!=null) {
				bis.close();
				fis.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("Error while closing");
			
		}
	}
}
}
