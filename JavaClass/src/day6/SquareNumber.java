package day6;

public class SquareNumber {
	
	public static void square(int num)
	{
		int sq=num*num;
		System.out.println(sq);
	}
	
public static void main(String[] args) {
	int num=15;
	int sq=num*num;
	System.out.println(sq);
	square(10);
	square(14);
}
}
