package flipkartTest;

public class Recurrsion {
	public static void call(String str) {
		if(str.length()<1) {
			System.out.println("");
		}
		else {
		System.out.print(str.charAt(str.length()-1));
		call(str.substring(0, str.length()-1));
		}
	}
	public static void main(String[] args) {
		
		//call("Nithesh");
		m();
	}
	
	static int count=0;
	public static void m() {
		count++;
		if(count<=5) {
			System.out.println("hello"+ count);
			m();
		}
		
	}

}
