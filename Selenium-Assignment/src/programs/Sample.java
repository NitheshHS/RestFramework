package programs;

public class Sample {
	public static void main(String[] args) {
		//a4b3c2
		//aaaabbbcc
		String str = "a4b3c3";
		String output = "";
		String previous="";
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch = str.charAt(i);
			if(ch >=97 || ch<=122)
			{
				previous =ch+"";
				output += ch;
				System.out.println(output);
			}
			else if(ch>=48 || ch<=57)
			{
				 
					String str1 = ""+ch;
					 int num = Integer.parseInt(str1);
					 System.out.println("num"+num);
					 for(int j=0;j<num;i++)
					 {
						 output +=previous; 
					 }
				
			}

		}
		System.out.println(output);

	}
}
