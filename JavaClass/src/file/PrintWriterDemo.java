package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
public static void main(String[] args) {
	File file=new File("H:\\writefile.txt");
	if(file.exists()) {
		try {
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			pw.println();
			pw.println("This is first line");
			pw.println("This is second Line");
			pw.println("This is third line");
			pw.close();
			System.out.println("Data successfully appended");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
