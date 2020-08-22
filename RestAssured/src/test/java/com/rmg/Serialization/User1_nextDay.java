package com.rmg.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class User1_nextDay {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream input=new ObjectInputStream(new FileInputStream("./nfs.ser"));
		NFS out=(NFS) input.readObject();
		System.out.println(out.name);
		System.out.println(out.level);
		System.out.println(out.life);
		System.out.println(out.scrore);
		
		
		input.close();
	}

}
