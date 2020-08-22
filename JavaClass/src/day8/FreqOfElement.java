package day8;

public class FreqOfElement {
	public static void main(String[] args) {
		String str="perfcet picture";
		int[] freq=new int[str.length()];
		
		char[] chars = str.toCharArray();
		
		for(int i=0;i<chars.length;i++) {
			freq[i]=1;
			for(int j=i+1;j<chars.length;j++) {
				if(chars[i]==chars[j]) {
					freq[i]++;
					chars[j]='0';
				}
			}
		}
		System.out.println(chars);
		for(int i=0;i<freq.length;i++) {
			if(chars[i]!=' '&&chars[i]!='0') {
			//System.out.println(freq[i]);
			System.out.println(chars[i]+"==>"+freq[i]);
			}
		}
		
	}

}
