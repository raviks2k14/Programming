package com.corejava.miscellaneous;

import java.util.Arrays;

public class JavaArraySquaresIncreasingOrder {

	public int[] getSquaresOfArrayInIncreasingOrder(int[] inputArray) {

		int[] finalArray = new int[inputArray.length];

		for (int i = 0; i < inputArray.length; i++) {
			finalArray[i] = inputArray[i] * inputArray[i];
		}
		Arrays.sort(finalArray);
		return finalArray;
	}

	public static void main(String[] args) {
		JavaArraySquaresIncreasingOrder obj = new JavaArraySquaresIncreasingOrder();
		int[] arr = new int[] { -7, -3, 2, 3, 11 };
		System.out.println(Arrays.toString(obj.getSquaresOfArrayInIncreasingOrder(arr)));
	}

}
