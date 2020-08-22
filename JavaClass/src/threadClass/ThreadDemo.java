package threadClass;

public class ThreadDemo {
public static void main(String[] args) throws InterruptedException {
	MyThread th=new MyThread();
	//th.setPriority(10);
	th.start();
	th.join();
	th.run();
	for(int i=0;i<=10;i++) {
		System.out.println("Main thread");
	}
}
}
