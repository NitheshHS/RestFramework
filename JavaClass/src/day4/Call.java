package day4;

public class Call {
	void invoke(Printable p) {
		if(p instanceof A)
		{
			A a=(A)p;
			a.a();
		}
		if(p instanceof B)
		{
			B b=(B)p;
			b.b();
		}
	}
}
