package com.corejava.programming;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SynchronizeHashMap {

	public static void main(String[] args) {

		/*
		 * HashMap is not synchronized collection class. We need to synchronize
		 * explicitly in order to perform thread-safe operations on it
		 */

		// Creating a HashMap of Integer keys and String values
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "Value1");
		hashmap.put(2, "Value2");
		hashmap.put(3, "Value3");
		hashmap.put(4, "Value4");
		hashmap.put(5, "Value5");
		Map<Integer, String> map = Collections.synchronizedMap(hashmap);
		Set<Entry<Integer, String>> set = map.entrySet();
		synchronized (map) {
			Iterator<Entry<Integer, String>> i = set.iterator();
			// Display elements
			while (i.hasNext()) {
				Map.Entry<Integer, String> pair = (Map.Entry<Integer, String>) i
						.next();
				System.out.print(pair.getKey() + ": ");
				System.out.println(pair.getValue());
			}
		}
	}

}
