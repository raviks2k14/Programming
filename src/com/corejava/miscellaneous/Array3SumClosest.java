package com.corejava.miscellaneous;

import java.util.Arrays;

public class Array3SumClosest {

	public static int[] getSumClosest(int[] inputArray, int target) {
		int[] finalArray = null;
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				for (int k = j + 1; k < inputArray.length; k++) {
					if (finalArray == null) {
						finalArray = new int[] { inputArray[i], inputArray[j], inputArray[k] };
					} else {
						if (Math.abs(finalArray[0] + finalArray[1] + finalArray[2] - target) > Math
								.abs(inputArray[i] + inputArray[j] + inputArray[k] - target)) {
							finalArray = new int[] { inputArray[i], inputArray[j], inputArray[k] };
						}
					}
				}
			}
		}
		return finalArray;
	}

	public static void main(String[] args) {
		int[] inputArray = new int[] { -1, 2, 1, -4 };
		int target = 1;
		System.out.println(Arrays.toString(getSumClosest(inputArray, target)));
	}

}
