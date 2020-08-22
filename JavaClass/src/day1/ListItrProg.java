package day1;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListItrProg {
public static void main(String[] args) {
	LinkedList<String> li=new LinkedList<String>();
	li.add("Nithesh");
	li.add("Madhu");
	li.add("pavan");
	li.add("supreeth");
	ListIterator<String> l=li.listIterator();
	while(l.hasNext()) {
		String str = (String)l.next();
		if(str.equals("Nithesh"))
		{
			l.set("Nithesh Gowda");
		}
	}
	System.out.println(li);
}
}
