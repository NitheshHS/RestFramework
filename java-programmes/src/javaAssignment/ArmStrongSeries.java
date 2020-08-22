package javaAssignment;

public class ArmStrongSeries {
	public static void main(String[] args) {
		for(int num=1;num<=1000;num++) {
			int count=0,sum=0,temp=num;
			while(num!=0) {
				num=num/10;
				count++;
			}
			num=temp;
			while(num!=0) {
				int rem=num%10;
				int mul=1;
				for(int i=1;i<=count;i++) {
					mul=mul*rem;
				}
				sum=sum+mul;
				num=num/10;
			}
			if(temp==sum) {
				System.out.println(temp);
			}
		}
	}
}
