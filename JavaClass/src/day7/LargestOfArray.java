package day7;

public class LargestOfArray {
public static void main(String[] args) {
	int arr[]= {11,75,56,45};
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		
	}
		
	System.out.println("largest value is: "+max);
}
}
