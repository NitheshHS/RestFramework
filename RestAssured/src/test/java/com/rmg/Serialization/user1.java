package com.rmg.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class user1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		NFS user=new NFS("Nithesh", 3, 12, 12000);
		
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("./nfs.ser"));
		out.writeObject(user);
		out.close();
		System.out.println("done");
	}

}
