package javaAssignment;

public class PalindromeNumbers {
	public static void main(String[] args) {

		System.out.println("Palindrome numbers form 1 to 1000 are");
		for(int num=1;num<=100;num++) {
			int temp=num,rev=0;
			while(num>0) {
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			if(temp==rev) {
				System.out.println(rev);
				temp++;
			}
		}
	}
}
