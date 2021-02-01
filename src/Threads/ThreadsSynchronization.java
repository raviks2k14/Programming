package Threads;

class ResourceClass {
	synchronized public void printCounterValues(String threadName) {
		for (int i = 5; i > 0; i--) {
			System.out.println("Counter : " + threadName + " : " + i);
		}
	}
}

public class ThreadsSynchronization implements Runnable {

	String threadName;
	ResourceClass rc;

	public ThreadsSynchronization(String threadName, ResourceClass rc) {
		this.threadName = threadName;
		this.rc = rc;
	}

	@Override
	public void run() {
		//synchronized (rc) {
			rc.printCounterValues(threadName);
		//}
	}

	public static void main(String[] args) {
		ResourceClass resourceObj = new ResourceClass();
		ThreadsSynchronization thread1 = new ThreadsSynchronization("Thread-1", resourceObj);
		ThreadsSynchronization thread2 = new ThreadsSynchronization("Thread-2", resourceObj);

		Thread th1 = new Thread(thread1);
		Thread th2 = new Thread(thread2);

		th1.start();
		th2.start();
	}

}
