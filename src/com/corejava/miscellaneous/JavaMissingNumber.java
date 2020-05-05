package com.corejava.miscellaneous;

import java.util.Arrays;

public class JavaMissingNumber {

	public int getMissingNumber(int[] testArray) {
		Arrays.sort(testArray);
		for (int i = 0; i < testArray.length; i++) {
			if (i < testArray.length - 1) {
				int diff = testArray[i + 1] - testArray[i];
				if (diff > 1) {
					return testArray[i] + 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		JavaMissingNumber jmn = new JavaMissingNumber();
		int[] testArray = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(jmn.getMissingNumber(testArray));
	}

}
