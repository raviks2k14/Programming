package Sorting;

import java.util.Arrays;

public class SelectionSort {

	/*
	 * Select the minimum element from the array and swap every time. This sorting
	 * takes O(n2) time complexity since it has 2 for loops
	 */
	public int[] selectionSort(int[] inputArray) {

		for (int i = 0; i < inputArray.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[j] < inputArray[minIndex]) {
					minIndex = j;
				}
			}
			int temp = inputArray[minIndex];
			inputArray[minIndex] = inputArray[i];
			inputArray[i] = temp;
		}
		return inputArray;
	}

	public static void main(String[] args) {
		SelectionSort slObj = new SelectionSort();
		int[] inputArray = new int[] { 15, 18, 3, 11, 9, 5, 17, 2, 0 };
		System.out.println(Arrays.toString(slObj.selectionSort(inputArray)));
	}

}
