package Sorting;

import java.util.Arrays;

public class InsertionSort {

	/*
	 * Searches for the appropriate space where the card has to be plabced. Ex : Put
	 * a card in the right space. This sorting takes O(n2) time complexity since it
	 * has 2 for loops
	 */
	public int[] insertionSort(int[] inputArray, int targetNumber) {
		int[] finalArray = new int[inputArray.length + 1];
		int finalArrayIndex = 0;
		boolean inserted = false;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] < targetNumber) {
				finalArray[finalArrayIndex] = inputArray[i];
				finalArrayIndex++;
			} else {
				finalArray[finalArrayIndex] = targetNumber;
				for (int p = i; p < inputArray.length; p++) {
					finalArrayIndex++;
					finalArray[finalArrayIndex] = inputArray[p];
					inserted = true;
				}
				break;
			}
		}

		if (!inserted) {
			finalArray[inputArray.length] = targetNumber;
		}
		return finalArray;
	}

	public static void main(String[] args) {
		InsertionSort insObj = new InsertionSort();
		int[] inputArray = new int[] { 5, 8, 9, 13, 15, 18 };
		int targetNumber = 11;
		System.out.println(Arrays.toString(insObj.insertionSort(inputArray, targetNumber)));
	}

}
