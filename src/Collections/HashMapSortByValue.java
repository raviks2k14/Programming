package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HashMapSortByValue {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<>();
		hashmap.put(22, "A");
		hashmap.put(55, "B");
		hashmap.put(33, "Z");
		hashmap.put(44, "M");
		hashmap.put(99, "I");
		hashmap.put(88, "X");

		System.out.println("Before Sorting, HashMap content\n");
		Set<Entry<Integer, String>> entrySetForhashMap = hashmap.entrySet();
		for (Entry<Integer, String> entry : entrySetForhashMap) {
			System.out.println("Key : " + entry.getKey() + ", Value : "
					+ entry.getValue());
		}

		// This below approach will sort the hashmap based on keys
		System.out
				.println("\nAfter Sorting, with sort by key approach (converting hashmap into treemap)\n");
		Map<Integer, String> treemap = new TreeMap<Integer, String>(hashmap);
		Set<Entry<Integer, String>> entrySetForTreeMap = treemap.entrySet();
		for (Entry<Integer, String> entry : entrySetForTreeMap) {
			System.out.println("Key : " + entry.getKey() + ", Value : "
					+ entry.getValue());
		}

		// Sort by value approach
		HashMap<Integer, String> sortedHashMap = sortByValue(hashmap);
		System.out
				.println("\nAfter Sorting, with sort by value approach (using comparator)\n");
		Set<Entry<Integer, String>> entrySetForSortedhashMap = sortedHashMap
				.entrySet();
		for (Entry<Integer, String> entry : entrySetForSortedhashMap) {
			System.out.println("Key : " + entry.getKey() + ", Value : "
					+ entry.getValue());
		}

	}

	public static HashMap<Integer, String> sortByValue(
			HashMap<Integer, String> hashmap) {
		List<Entry<Integer, String>> list = new LinkedList<>(hashmap.entrySet());
		// Defined Custom Comparator here
		Collections.sort(list, new Comparator<Entry<Integer, String>>() {
			public int compare(Entry<Integer, String> o1,
					Entry<Integer, String> o2) {
				return ((Comparable<String>) ((Entry<Integer, String>) (o1))
						.getValue()).compareTo(((Entry<Integer, String>) (o2))
						.getValue());
			}
		});

		// Here I am copying the sorted list in HashMap
		// using LinkedHashMap to preserve the insertion order
		HashMap<Integer, String> sortedHashMap = new LinkedHashMap<>();
		for (Iterator<Entry<Integer, String>> it = list.iterator(); it
				.hasNext();) {
			Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;

	}

}
