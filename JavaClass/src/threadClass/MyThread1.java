package threadClass;

public class MyThread1 implements Runnable {

	
	public void run() {
		for(int i=0;i<=10;i++) {
			Thread.yield();
			System.out.println("child method");
		}
	}

}
