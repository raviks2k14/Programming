package com.corejava.miscellaneous;

import java.util.Arrays;
import java.util.HashSet;

class HarmonousSequence {
	public int findLHS(int[] inputArray) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int i = 0;
		int k = 0;

		while (i < inputArray.length - 1) {
			if (!(Math.abs(inputArray[i] - inputArray[i + 1]) > 1)) {
				hs.add(i);
				hs.add(i + 1);
			}
			i++;
		}

		int[] finalArray = new int[hs.size()];

		for (Integer ins : hs) {
			finalArray[k] = inputArray[ins.intValue()];
			k++;
		}

		System.out.println(Arrays.toString(finalArray));

		return hs.size();
	}

	public static void main(String[] args) {
		HarmonousSequence s = new HarmonousSequence();
		int[] inputArray = new int[] { 1, 3, 2, 3, 5, 2, 3, 7 };
		System.out.println(s.findLHS(inputArray));
	}
}