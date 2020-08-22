package day3;

public class Circle {
	Opration op;
	double pi=3.14;
	double Area(double radius)
	{
		op=new Opration();
		double rsquare = pi*op.square(radius);
		return rsquare;
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		double a=c.Area(12);
		System.out.println("area is: "+a);
	}
}
