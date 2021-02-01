package Sorting;

public class QuickSortProgramming {

//	This algorithm is of O(n log n) time complexity and is much better than Merge sort since it is a in place sorting algorithm.
//	Gives O(n2) when the array input is already sorted in ascending or descending order which is a worst case scenario
	private static void quickSort(int[] list, int first, int last) {
		if (first < last) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
		}
	}

	/** Partition the array list[first..last] */
	private static int partition(int[] list, int first, int last) {
		int pivot = list[first]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; // Index for backward search

		while (low < high) {
			// Search forward from left
			while (low <= high && list[low] <= pivot)
				low++;

			// Search backward from right
			while (low <= high && list[high] > pivot)
				high--;

			// Swap two elements in the list
			if (high > low) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}

		while (high > first && list[high] >= pivot)
			high--;

		// Swap pivot with list[high]
		if (pivot > list[high]) {
			list[first] = list[high];
			list[high] = pivot;
			return high;
		} else {
			return first;
		}
	}

	/** A test method */
	public static void main(String[] args) {
		int[] inputArray = { 5, 2, 9, 3, 8, 4, 0, 1, 6, 7 };
		quickSort(inputArray, 0, inputArray.length - 1);
		for (int i = 0; i < inputArray.length; i++)
			System.out.print(inputArray[i] + " ");
	}
}
