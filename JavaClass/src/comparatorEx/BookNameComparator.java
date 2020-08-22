package comparatorEx;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Author1> {

	
	public int compare(Author1 au1, Author1 au2) {
		
		return au1.book.compareTo(au2.book);
	}
	

}
