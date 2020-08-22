package comparatorEx;

public class Author implements Comparable<Author> {
	String firstName;
	String LastName;
	String Book;
	public Author(String firstName, String lastName, String book) {
		this.firstName = firstName;
		this.LastName = lastName;
		this.Book = book;
	}
	
	public int compareTo(Author au) {
		int last=this.LastName.compareTo(au.LastName);
		return last==0?this.firstName.compareTo(au.firstName):last;
	}
	

}
