package comparatorEx;

public class Author1 implements Comparable<Author1>{
	String firstname;
	String book;
	int auAge;
	public Author1(String firstname, String book, int auAge)
	{
		this.firstname=firstname;
		this.book=book;
		this.auAge=auAge;
				
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public int getAuAge() {
		return auAge;
	}
	public void setAuAge(int auAge) {
		this.auAge = auAge;
	}
	
	public int compareTo(Author1 au) {
		int last=this.firstname.compareTo(au.firstname);
		return last;
	}
	

}
