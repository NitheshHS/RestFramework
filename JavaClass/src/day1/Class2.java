package day1;

public class Class2 {
	public static void main(String[] args) {
		//	char c='b';
		//	System.out.println(c);
		//	char c1=' ';
		//	int i=(int)c;
		//	System.out.println(i);
		//	
		//boolean

		//	boolean b=true;
		//	System.out.println(b);
		//	boolean b1= false;
		//	System.out.println(b1);
		
		sum();
		sum(10,20,30);
	}
	public static void sum(int... a) {
		//System.out.println("var-arg method");
		int add=0;
		for(int n:a) {
			add+=n;
		}
		System.out.println(add);
	}
}
