package day9;



public class VarMethod {
	public int sum(int...num) {
		int add=0;
		for(int a:num) {
			add=add+a;
		}
		return add;
	}

	public static void main(String[] args) {
		VarMethod var=new VarMethod();
		int sum = var.sum(10,20,30,40);
		System.out.println(sum);
		
	}
}
