package comparatorEx;

import java.util.ArrayList;
import java.util.Collections;

public class SortingPgm {
public static void main(String[] args) {
	ArrayList<Author1> al=new ArrayList<>();
	al.add(new Author1("Henry", "Tropic of Cancer",  45));
    al.add(new Author1("Nalo", "Brown Girl in the Ring", 56));
    al.add(new Author1("Frank", "300", 65));
    al.add(new Author1("Deborah", "Sky Boys", 51));
    al.add(new Author1("George R. R.", "A Song of Ice and Fire", 62));
    System.out.println("\nSort by author name");
    Collections.sort(al);
    for(Author1 str:al)
    {
    	System.out.println(str.getFirstname()+" "+str.getBook()+" "+str.getAuAge());
    }
    
    System.out.println("\nSort by author age");
    Collections.sort(al, new AuthorAgeComparator());
    for(Author1 str: al) {
    	System.out.println(str.getFirstname()+" "+str.getBook()+" "+str.getAuAge());
    }
    
    System.out.println("\n sort by book");
    Collections.sort(al, new BookNameComparator());
    for(Author1 str:al) {
    	System.out.println(str.getFirstname()+" "+str.getBook()+" "+str.getAuAge());
    }
    
}
}
