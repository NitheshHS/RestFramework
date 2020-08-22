package javaAssignment;

public class FibonacciSeries {
public static void main(String[] args) {
	int first=0,second=1,third=1;
	for(int i=1;i<=10;i++) {
		third=first+second;
		first=second;
		second=third;
		System.out.println(first);
	}
}
}
