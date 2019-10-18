package com.corejava.programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SynchronizeArrayList {

	public static void main(String[] args) {

		/*
		 * Since ArrayList is non-synchronized and so should not be used in
		 * multithreaded environment without explicit synchronization.
		 */

		ArrayList<String> al = new ArrayList<String>();
		Collections.synchronizedList(al);

		al.add("ABC");
		al.add("DEF");
		al.add("GHI");
		al.add("JKL");
		al.add("MNO");

		synchronized (al) {
			Iterator<String> itr = al.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}
}
