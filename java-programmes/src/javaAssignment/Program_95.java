package javaAssignment;

public class Program_95 {
	public static void main(String[] args) {
		int num=1634,count=0,sum=0;
		int temp=num;
		while(num>0) {
			num/=10;
			count++;
		}
		num=temp;
		while(num>0) {
			int pow=1;
			int rem=num%10;
			for(int i=1;i<=count;i++) {
				pow=pow*rem;
			}
			sum+=pow;
			num/=10;
		}
		if(sum==temp) {
			System.out.println("ArmStrong Number");
		}else {
			System.out.println("Not ArmStrong Number");
		}
	}
}

