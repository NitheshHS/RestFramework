package day3;

public class WhileLoopEx {
public static void main(String[] args) {
	//wap a program to alternate alphabets from a to z
	char ch='a';//declaration 
	while(ch>=97 && ch<=122)//condition
	{
		System.out.print(ch+",");
		ch+=2;// increment
	}
	
	
	
}
}
