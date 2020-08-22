package day8;

public class DuplicateCharacter {
	public static void main(String[] args) {
		String str="Great responsibility";
		int count;
		
		char[] chars=str.toCharArray();
		
		for(int i=0;i<chars.length;i++) {
			count=1;
			for(int j=i+1;j<chars.length;j++) {
				if(chars[i]==chars[j]&&chars[i]!=' ') {
					count++;
					chars[j]='0';
				}
			}
			if(count>1 &&chars[i]!='0') {
				System.out.println(chars[i]+"==>"+count);
			}
		}
	}

}
