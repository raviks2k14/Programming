package com.corejava.threads;

public class ThreadDemo implements Runnable {

	@Override
	synchronized public void run() {

		try {
			for (int i = 4; i > 0; i--) {
				System.out.println(Thread.currentThread().getName() + "," + i);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()
					+ " interrupted.");
		}
		System.out.println(Thread.currentThread().getName() + " exiting.");
	}

	public static void main(String[] args) {
		ThreadDemo obj = new ThreadDemo();

		Thread t1 = new Thread(obj, "ThreadA");
		Thread t2 = new Thread(obj, "ThreadB");
		Thread t3 = new Thread(obj, "ThreadC");

		t1.start();
		t2.start();
		t3.start();
	}

}
