package programs;

public class Program_01 {
public static boolean isStrong(int num) {
	int fact=1,sum=0,temp=num;
	while(num!=0) {
		
		int rem=num%10;
		for(int i=rem;i>0;i--) {
			fact=fact*i;
		}
		sum=sum+fact;
		num/=10;
	}
	if(sum==temp) {
		return true;
	}else {
		return false;
	}	
	}
public static void main(String[] args) {
	boolean flag = isStrong(145);
	if(flag==true) {
		System.out.println("Strong Number");
	}else {
		System.out.println("not Strong number");
	}
}
}

