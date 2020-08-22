package day1;

import java.util.Comparator;
import java.util.TreeSet;

public class Mycomparator implements Comparator<String>{


	public int compare(String s1, String s2) {

		return -s1.compareTo(s2);
	}

}

