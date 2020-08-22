package array;

public class CopyArray {
public static void main(String[] args) {
	int arr1[] = {1,2,3,4,5,5};
	int arr2[]=new int[arr1.length];
	for(int i=0;i<arr1.length;i++)
	{
		arr2[i]=arr1[i];
	}
	
	//array1
	System.out.println("array1");
	for(int i=0;i<arr1.length;i++)
	{
		System.out.println(arr1[i]);
	}
	System.out.println("----->array2<------");
	for(int i=0;i<arr2.length;i++)
	{
		System.out.println(arr2[i]);
	}
	
}
}
