package day6;

public class TestSleepMethod extends Thread {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		TestSleepMethod ts1=new TestSleepMethod();
		TestSleepMethod ts2=new TestSleepMethod();
		ts1.start();
		ts2.start();
	}

}
