package javaAssignment;

public class Program_49 {
public static void main(String[] args) {
	int[] arr= {10,2,55,12,2,3};
	int largest=0;
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]>largest) {
			largest=arr[i];
		}
	}
	System.out.println(largest);
}
}
