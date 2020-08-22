package javaAssignment;

public class SpecialCharacters {
public static void main(String[] args) {
  char ch = 0;
  for(int i=0;i<=100;i++) {
	if(ch>=97 && ch<=122 || ch>=65 && ch<=90 || ch>=48 && ch<=58)
		System.out.println(ch);
  }
}
}
