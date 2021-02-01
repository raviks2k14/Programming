package Algorithms;

import java.util.Arrays;

public class ZigZag {

	static int arr[] = new int[] { 4, 3, 7, 8, 6, 2, 1 };
	// static int arr[] = new int[] { 1, 4, 3, 2 };

	// Method for zig-zag conversion of array
	static void zigZag() {
		int l = 0;
		int r = arr.length - 1;
		boolean flag = false;
		int temp = 0;
		while (l < r) {

			if (!flag) {
				if (!(arr[l] < arr[l + 1])) {
					temp = arr[l + 1];
					arr[l + 1] = arr[l];
					arr[l] = temp;
				}
			}

			if (flag) {
				if (!(arr[l] > arr[l + 1])) {
					temp = arr[l + 1];
					arr[l + 1] = arr[l];
					arr[l] = temp;
				}
			}

			flag = !flag;
			l++;
		}
	}

	// Driver method to test the above function
	public static void main(String[] args) {
		zigZag();
		System.out.println(Arrays.toString(arr));
	}

}
