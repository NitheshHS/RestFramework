package threadClass;

public class MyThread extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			Thread.yield();
			System.out.println("Child thread");
		}
	}

}
