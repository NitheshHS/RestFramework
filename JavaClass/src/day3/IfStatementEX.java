package day3;

public class IfStatementEX {
public static void main(String[] args) {
	//wap to find the given number is >10 or =10 or <10
	int num=11;
	if(num>=10) {//2>10==false
		System.out.println("greater");
	}
	else if(num==10)//2==10 false
	{
		System.out.println("equal");
	}
	else if(num<=10)//2<10== true
	{
		System.out.println("lesser");
	}
}
}
