package comparatorEx;

import java.util.ArrayList;
import java.util.Collections;

public class SortAuthByNames {
public static void main(String[] args) {
	ArrayList<Author> ar=new ArrayList<>();
	ar.add(new Author("Henry","Miller", "Tropic of Cancer"));
	ar.add(new Author("Nalo","Hopkinson", "Brown Girl in the Ring"));
	ar.add(new Author("Frank","Miller", "300"));
	ar.add(new Author("Deborah","Hopkinson", "Sky Boys"));
	ar.add(new Author("George R. R.","Martin", "Song of Ice and Fire"));
	Collections.sort(ar);
	for(Author str:ar) {
		System.out.println(str.firstName+" "+str.LastName+" book: "+str.Book);
		
	}
	
}
}
