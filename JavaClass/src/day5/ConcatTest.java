package day5;

public class ConcatTest {
public static void main(String[] args) {
	long startTime=System.currentTimeMillis();
	StringBuffer st=new StringBuffer();
	for(int i=0;i<10000;i++)
	{
		st.append("tjava");
	}
	System.out.println("time taken by string buffer: "+(System.currentTimeMillis() - startTime)+"ms");
	startTime=System.currentTimeMillis();
	StringBuilder str=new StringBuilder();
	for(int i=0;i<10000;i++)
	{
		str.append("Tpoint");
	}
	System.out.println("time taken by string builder: "+(System.currentTimeMillis()-startTime)+"ms");
}
}
