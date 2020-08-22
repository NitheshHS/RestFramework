package day8;

public class WrapperClass {
	int data = 50;
	public void change(int data) {
		data=data+50;
	}
	public static void main(String[] args) {
		WrapperClass wc=new WrapperClass();
		System.out.println("actual data: "+wc.data);
		wc.change(50);
		System.out.println("present data: "+wc.data);
	}

}
