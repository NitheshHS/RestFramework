package day7;

public class StringqualParts {
public static void main(String[] args) {
	String str="aaaabbbbcccc";
	int len=str.length();
	int n=3;
	int temp=0,chars=len/n;
	String[] eqstr=new String[n];
	
	if(len%n!=0)
	{
		System.out.println("the string cannot devide"+n+" equal parts");
	}
	else
	{
		for(int i=0;i<len;i=i+chars)
		{
			String part=str.substring(i, i+chars);
			eqstr[temp]=part;
			temp++;
		}
		
	}
	System.out.println(n+" equals parts of strings");
	for(int i=0;i<eqstr.length;i++)
	{
		System.out.println(eqstr[i]);
	}
	
	
}
}
