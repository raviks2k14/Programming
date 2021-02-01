package Miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class JavaMajorityElement {

	static int[] getMajorityElements(int[] inputArray) {
		int maxOccurance = (int) Math.floor(inputArray.length / 3);
		ArrayList<Integer> al = new ArrayList<Integer>();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			if (hm.containsKey(inputArray[i])) {
				hm.put(inputArray[i], hm.get(inputArray[i]) + 1);
			} else {
				hm.put(inputArray[i], 1);
			}
		}

		Set<Entry<Integer, Integer>> entrySet = hm.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() > maxOccurance) {
				al.add(entry.getKey());
			}
		}

		int[] finalArray = new int[al.size()];

		for (int i = 0; i < al.size(); i++) {
			finalArray[i] = al.get(i);
		}

		return finalArray;
	}

	public static void main(String[] args) {
		int[] testInput = new int[] { 1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 5, 5, 8 };
		System.out.println(Arrays.toString(getMajorityElements(testInput)));
	}

}
