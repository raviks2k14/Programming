package com.corejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DifferentWaysToIteratorHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hshMap = new HashMap<>();
		hshMap.put(1, "Ravi");
		hshMap.put(2, "Greeshu");
		hshMap.put(3, "Pratibha");

		// 1st method of iteration ---> Using only entrySet()
		System.out.println("// 1st method of iteration ---> Using only entrySet()\n");
		Set<Entry<Integer, String>> entrySet = hshMap.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}
		
		// 2nd method of iteration ---> Using only entrySet() + iterator
		System.out.println("\n// 2nd method of iteration ---> Using only entrySet() + iterator\n");
		Iterator<Entry<Integer, String>> entrySetIterator = entrySet.iterator();
		while(entrySetIterator.hasNext()){
			Entry<Integer, String> entry = entrySetIterator.next();
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}

		// 3rd method of iteration ---> Using only keySet()
		System.out.println("\n// 3rd method of iteration ---> Using only keySet()\n");
		for (Integer key : hshMap.keySet()) {
			System.out.println("Key : " + key + ", Value : " + hshMap.get(key));
		}
		
		// 4th method of iteration ---> Using only keySet() + iterator
		System.out.println("\n// 4th method of iteration ---> Using only keySet() + iterator\n");
		Set<Integer> intKeys = hshMap.keySet();
		Iterator<Integer> itKeySet = intKeys.iterator();
		while(itKeySet.hasNext()){
			Integer integer = itKeySet.next();
			System.out.println("Key : " + integer +", Value : "+hshMap.get(integer));
		}
	}
}
