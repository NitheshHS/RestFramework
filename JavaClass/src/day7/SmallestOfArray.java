package day7;

public class SmallestOfArray {
public static void main(String[] args) {
	int arr[]=new int[] {27,76,89,1};
	int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
		
	}
	System.out.println("the smallest element of given array: "+min);
}
}
