package javaAssignment;

public class MultiplesOfThreeSixNine {
public static void main(String[] args) {
	
	System.out.println("Multiples of 3, 6 and 9 are: ");
	for(int i=1;i<=100;i++) {
		if(i%3==0 || i%6==0 || i%9==0) {
			System.out.println(i);
		}
	}
}
}
