package day7;

import java.util.Arrays;

public class AscendingOrderOfArray {
public static void main(String[] args) {
	int arr[]=new int[] {2,4,3,1,5};
	System.out.println("original array");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	int temp=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("After sorting");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
//	Arrays.sort(arr);
//	for(int i=0;i<arr.length;i++)
//	{
//		System.out.println(arr[i]);
//	}
	
	
}
}
