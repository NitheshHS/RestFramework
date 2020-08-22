package javaAssignment;

public class Program_45 {
	public static void main(String[] args) {
		String str="Nithesh";
		String rev="";
		char[] arr=new char[str.length()];
		for(int i=str.length()-1;i>=0;i--) {

			rev+=str.charAt(i);
		}
		for(int i=0;i<=rev.length()-1;i++) {
			arr[i]=rev.charAt(i);
		}
		System.out.println(arr);
	}
}
