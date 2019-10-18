package com.corejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortingHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hashmap = new HashMap<>();
		hashmap.put(22,"A");
	    hashmap.put(55,"B");
	    hashmap.put(33,"Z");
	    hashmap.put(44,"M");
	    hashmap.put(99,"I");
	    hashmap.put(88,"X");

		// 2nd method of iteration ---> Using only entrySet() + iterator
		System.out.println("Before Sorting \n");
		Set<Entry<Integer, String>> entrySet = hashmap.entrySet();
		Iterator<Entry<Integer, String>> entrySetIterator = entrySet.iterator();
		while (entrySetIterator.hasNext()) {
			Entry<Integer, String> entry = entrySetIterator.next();
			System.out.println("Key : " + entry.getKey() + ", Value : "
					+ entry.getValue());
		}
		
		System.out.println("\nAfter Sorting \n");
		
		Map<Integer, String> treemap = new TreeMap<Integer, String>(hashmap);
		
		Set<Entry<Integer, String>> entrySetTreeMap = treemap.entrySet();
		Iterator<Entry<Integer, String>> entrySetIteratorTreeMap = entrySetTreeMap.iterator();
		while (entrySetIteratorTreeMap.hasNext()) {
			Entry<Integer, String> entry = entrySetIteratorTreeMap.next();
			System.out.println("Key : " + entry.getKey() + ", Value : "
					+ entry.getValue());
		}
	}

}
