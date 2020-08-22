package file;

import java.io.File;

public class ListOfFiles {
public static void main(String[] args) {
	File file=new File("C:\\Users\\user\\Desktop\\Automation class");
	String[] files = file.list();
	for(String fi:files)
	{
		System.out.println(fi);
	}
	
}
}
