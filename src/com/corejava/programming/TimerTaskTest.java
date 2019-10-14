package com.corejava.programming;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskTest {
	public static Timer timer;
	public static long startTime = System.currentTimeMillis();

	public static void main(String[] args) {
		timer = new Timer();
		TimerTask task = new Helper();
		timer.schedule(task, 0, 30000);
	}

}

class Helper extends TimerTask {
	TimerTaskTest timerTaskTest = new TimerTaskTest();

	public void run() {
		System.out.println("Time Elapsed : "
				+ (((System.currentTimeMillis()) - TimerTaskTest.startTime))
				/ 1000 + "s");

		int timeDiff = (int) (((System.currentTimeMillis()) - TimerTaskTest.startTime)) / 1000;

		if (timeDiff > 0 && timeDiff < 60) {
			System.out.println("Less than 1 min");
		} else if (timeDiff > 60 && timeDiff < 120) {
			System.out.println("Less than 2 mins");
		} else if (timeDiff > 60 && timeDiff < 180) {
			System.out.println("Less than 3 mins");
		} else if (timeDiff > 200) {
			TimerTaskTest.timer.cancel();
		}
	}

}
