package Miscellaneous;

import java.util.*;

class MergeSortedArrays {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		for (int i = 0; i < n; i++) {
			nums1[m] = nums2[i];
			m++;
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}

	public static void main(String[] args) {
		MergeSortedArrays s = new MergeSortedArrays();
		s.merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
	}
}