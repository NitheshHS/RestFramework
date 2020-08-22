package hashMap;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SerializedHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "Aa");
		map.put(33, "Cc");
		map.put(11, "Bb");
		try
		{
			FileOutputStream fos=new FileOutputStream("hashmap.ser");
			ObjectOutputStream os=new ObjectOutputStream(fos);
			os.writeObject(map);
			os.close();
			fos.close();
			System.out.println("serialized hashmap data saved in hashmap.ser");
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}

	}

}
