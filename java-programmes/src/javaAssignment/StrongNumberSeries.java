package javaAssignment;

import java.util.Scanner;

public class StrongNumberSeries {
	public static void main(String[] args) {
		
		for(int num=1;num<=1000;num++) {
			int temp,rem,sum=0,i,fact;
			temp=num;
			while(temp>0) {
				fact=1;
				i=1;
				rem=temp%10;
				while(i<=rem) {
					fact=fact*i;
					i++;
					
				}
				sum=sum+fact;
				temp=temp/10;
			}
			if(num==sum) {
				System.out.println(num);
			}
		}
	}
}

