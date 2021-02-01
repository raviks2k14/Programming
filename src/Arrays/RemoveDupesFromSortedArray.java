package Arrays;

import java.util.Arrays;

public class RemoveDupesFromSortedArray {

	public int removeDuplicates(int[] nums) {

		int n = nums.length;

		if (nums.length == 0 || nums.length == 1)
			return n;

		int temp[] = new int[n];

		// Start traversing elements
		int j = 0;
		for (int i = 0; i < n - 1; i++)
			// If current element is not equal
			// to next element then store that
			// current element
			if (nums[i] != nums[i + 1])
				temp[j++] = nums[i];

		// Store the last element as whether
		// it is unique or repeated, it hasn't
		// stored previously
		temp[j++] = nums[n - 1];

		// Modify original array
		for (int i = 0; i < j; i++)
			nums[i] = temp[i];

		System.out.println(Arrays.toString(temp));

		return j;
	}

	public static void main(String[] args) {

		int nums[] = { 1, 1, 2, 3, 4, 4, 4 };
		System.out
				.println("The length of sorted array is : " + new RemoveDupesFromSortedArray().removeDuplicates(nums));
	}

}
