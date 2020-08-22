package day6;

public class Operation {
	int data=50;
	void change(Operation op)
	{
		op.data=op.data+50;
	}
	public static void main(String[] args) {
		Operation op=new Operation();
		System.out.println(op.data);
		op.change(op);
		System.out.println(op.data);
				
	}
	

}
