package day9;

public class ConvertUpperToLower {
public static void main(String[] args) {
	
	String str="Great PoWer";
	StringBuilder str1=new StringBuilder(str);
	
	for(int i=0;i<str.length();i++) {
		if(Character.isLowerCase(str.charAt(i))) {
			str1.setCharAt(i, Character.toUpperCase(str.charAt(i)));
		}
		else if(Character.isUpperCase(str.charAt(i)))
		{
			str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));
		}
	}
	
	System.out.println(str1);
}
}
