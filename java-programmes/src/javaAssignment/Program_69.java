package javaAssignment;

public class Program_69 {
public static void main(String[] args) {
	String str="perfect picture";
	int[] freq=new int[str.length()];
	char[] string =str.toCharArray();
	for(int i=0;i<=str.length()-1;i++) {
		for(int j=1+i;j<=str.length()-1;j++) {
			if(string[i]==string[j]) {
				freq[i]++;
				string[j]='0';
			}
		}
	}
	for(int i=0;i<=str.length()-1;i++) {
		if(string[i]!=' '&& string[i]!='0') {
			System.out.println(string[i]+"-"+freq[i]);
		}
	}
}
}
