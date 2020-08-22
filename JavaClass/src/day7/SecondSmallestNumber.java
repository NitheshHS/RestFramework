package day7;

public class SecondSmallestNumber {
	public static int getSecondSmallest(int a[], int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
	}
	public static void main(String[] args) {
		int arr[]=new int[] {56,76,12,11,14};
		System.out.println("Second Smallest number is: "+getSecondSmallest(arr, arr.length));
	}

}
