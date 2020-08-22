package day2;

public class EqualityOperator {
public static void main(String[] args) {
	char ch1 = 'A';
	char ch2 = 'A';
	System.out.println(ch1==ch2);//it will give boolean result true or false
	
	char ch3='B';
	System.out.println(ch1==ch3);
	
	System.out.println(ch1!=ch3);
	
	
	System.out.println(ch1>ch2);//(65>=66)
	
	System.out.println(ch1>=ch2);
	
	System.out.println(ch1<=ch2);
	
	System.out.println(ch1<ch2);
}
}
