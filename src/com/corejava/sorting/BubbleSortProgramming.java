package com.corejava.sorting;

public class BubbleSortProgramming {

	public static void main(String[] args) {
		Integer arr[] = new Integer[10];
		arr[0] = 3;
		arr[1] = 2;
		arr[2] = 1;
		arr[3] = 5;
		arr[4] = 4;
		arr[5] = 13;
		arr[6] = 10;
		arr[7] = 15;
		arr[8] = 9;
		arr[9] = 8;
		

		System.out.println("The array content before sorting\n");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\n");

		int p=0;
		while (p<arr.length) {
			System.out.println("Sort Pass :"+p);
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			p++;
		}

		System.out.println("\nThe array content after sorting\n");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
