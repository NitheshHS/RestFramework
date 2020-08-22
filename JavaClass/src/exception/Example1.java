package exception;

public class Example1 {
	public void checkProduct(int weight) {
		if(weight<100) {
			throw new InvalidProductException("invalid product");
		}
	}
	
	public static void main(String[] args) {
		Example1 obj=new Example1();
		try
		{
			obj.checkProduct(60);
		}
		catch(InvalidProductException e)
		{
			System.out.println("caught Exception");
			System.out.println(e.getMessage());
		}
	}

}
