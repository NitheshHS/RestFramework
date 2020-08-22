package file;

import java.io.File;

public class ListOFFile {
public static void main(String[] args) {
	File dir =new File("H:\\");
	File[] files = dir.listFiles();
	for(File file: files)
	{
		System.out.println(file.getName()+" can write "+file.canWrite()+" is hidden "+file.isHidden()+
				" file length "+file.length());
		
	}
	
	
	
}
}
