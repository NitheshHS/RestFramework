package day4;

public class Minimum {
	
	static void min(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
			
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		int a[]= {33,2,1,5};
		min(a);
	}

}
