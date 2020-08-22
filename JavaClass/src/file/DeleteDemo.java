package file;

import java.io.File;

public class DeleteDemo {
public static void main(String[] args) {
	try {
		File file=new File("H:\\writefile.txt");
		if(file.delete())
		{
			System.out.println(file.getName()+" is deleted successfully");
		}
		else
		{
			System.out.println(file.getName()+" file doesnot exist");
		}
	} catch (Exception e) {
		System.out.println("Exception occured");
	}
}
}
