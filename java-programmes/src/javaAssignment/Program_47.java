package javaAssignment;

public class Program_47 {
	public static void main(String[] args) {
		int arr[]= {10,2,3,4,5,11,66};
		int temp=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=1+i;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}


		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+", ");
		}
	}
}
