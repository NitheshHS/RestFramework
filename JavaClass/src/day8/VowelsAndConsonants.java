package day8;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		String str="perfect";
		char[] v=new char[str.length()];
		char[] c=new char[str.length()];
		int vowels=0;
		int cons=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch =='u') {
				vowels++;
				v[i]=ch;
			}
			else
			{
				cons++;
				c[i]=ch;
			}
		}
		
		System.out.println("The no vowels is :"+vowels+" "+v.toString());
		System.out.println("consonants: "+cons+" "+c.toString());
	}

}
