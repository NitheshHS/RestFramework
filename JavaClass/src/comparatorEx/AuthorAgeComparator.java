package comparatorEx;

import java.util.Comparator;

public class AuthorAgeComparator implements Comparator<Author1> {

	
	public int compare(Author1 o1, Author1 o2) {
		if(o1.auAge==o2.auAge)
			return 0;
		else if(o1.auAge>o2.auAge)
			return 1;
		else
			return -1;
	}
	

}
