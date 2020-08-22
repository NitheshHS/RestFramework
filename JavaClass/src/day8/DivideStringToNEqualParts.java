package day8;

public class DivideStringToNEqualParts {
	public static void main(String[] args) {
		String str=	"aaaabbbbcccc";
		int len=str.length();
		System.out.println(len);
		int n=3;
		int temp=0,chars=len/n;
		String[] eq=new String[n];
		if(len%n!=0) {
			System.out.println("cant divide");
		}
		else
		{
			for(int i=0;i<len;i=i+chars) {
				String part = str.substring(i, i+chars);
				eq[temp]=part;
				temp++;
				
			}
		}
		System.out.println("divided string");
		for(int i=0;i<eq.length;i++) {
			System.out.println(eq[i]);
		}
		
	}
}
