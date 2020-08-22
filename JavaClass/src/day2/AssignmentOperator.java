package day2;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		a+=b; //a=a+b 10+20
		System.out.println(a);
		
		
		c+=a+=b;// c=(c+a)+a+b
		System.out.println(c);
		
		b-=a;
		System.out.println(b);
		
		b/=a;// b=b/a 20=20/10==2
		System.out.println(b);
		
		b%=a;
		System.out.println(b);
		
	}

}
