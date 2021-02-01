package Collections;

import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class IterateTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> treemap = new TreeMap<>();

		treemap.put("A", "ABC");
		treemap.put("B", "DEF");
		treemap.put("C", "GHI");
		treemap.put("D", "JKL");
		treemap.put("E", "MNO");

		// 1st method of iteration ---> Using only entrySet()
		System.out.println("// 1st method of iteration ---> Using only entrySet()\n");
		Set<Entry<String, String>> entrySet = treemap.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println("Key : " + entry.getKey() + ", Value : "
					+ entry.getValue());
		}

		// 2nd method of iteration ---> Using only entrySet() + iterator
		System.out.println("\n// 2nd method of iteration ---> Using only entrySet() + iterator\n");
		Iterator<Entry<String, String>> entrySetIterator = entrySet.iterator();
		while (entrySetIterator.hasNext()) {
			Entry<String, String> entry = entrySetIterator.next();
			System.out.println("Key : " + entry.getKey() + ", Value : "
					+ entry.getValue());
		}

		// 3rd method of iteration ---> Using only keySet()
		System.out.println("\n// 3rd method of iteration ---> Using only keySet()\n");
		for (String key : treemap.keySet()) {
			System.out.println("Key : " + key + ", Value : " + treemap.get(key));
		}

		// 4th method of iteration ---> Using only keySet() + iterator
		System.out.println("\n// 4th method of iteration ---> Using only keySet() + iterator\n");
		Set<String> intKeys = treemap.keySet();
		Iterator<String> itKeySet = intKeys.iterator();
		while (itKeySet.hasNext()) {
			String str = itKeySet.next();
			System.out.println("Key : " + str + ", Value : "
					+ treemap.get(str));
		}

	}

}
