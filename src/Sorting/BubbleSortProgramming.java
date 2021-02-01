package Sorting;

public class BubbleSortProgramming {

	public static Integer[] sortArray(Integer arr[]) {
		System.out.println("\n");

		int p = 0;
		while (p < arr.length) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			p++;
		}
		return arr;
	}

	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 3, 2, 1, 5, 4, 13, 10, 15, 9, 8 };

		System.out.println("The array content before sorting\n");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		arr = sortArray(arr);

		System.out.println("\nThe array content after sorting\n");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
