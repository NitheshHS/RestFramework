package javaAssignment;

public class Program_50 {
public static void main(String[] args) {
	int[] arr= {10,20,30,40,50,10};
	int dup=0;
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=1+i;j<=arr.length-1;j++) {
			if(arr[i]==arr[j]) {
				 dup=arr[i];
			}
		}
	}
	System.out.println(dup);
}
}
