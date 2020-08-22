package programs;

public class Program_02 {
	public static int count(int num) {
		int count=0;
		while(num>0) {
			int re=num%10;
			count++;
		}
		return count;	
	}
	public static boolean isArmstrong(int num) {
		int sum=0,temp=num;
		while(num!=0) {
		int rem=num%10;
		int pow=1;
		for(int i=1;i<=count(num);i++) {
			pow=pow*rem;
		}
		sum=sum+pow;
		num=num/10;
		}
		if(sum==temp)
		return true;
		else
		return false;
}
	public static void main(String[] args) {
		count(1634);
		boolean flag=isArmstrong(1634);
		if(flag==true)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
