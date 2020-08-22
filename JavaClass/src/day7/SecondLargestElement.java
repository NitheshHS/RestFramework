package day7;

public class SecondLargestElement {
	public static int getSecondLargest(int a[], int total)
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		return a[total-2];
		
	}
	
	
public static void main(String[] args) {
	int arr1[]= {12,34,45,11,15};
	System.out.println("the second largest number is "+getSecondLargest(arr1, arr1.length));
}
}
