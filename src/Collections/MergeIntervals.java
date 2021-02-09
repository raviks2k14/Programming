package Collections;

import java.util.*;

public class MergeIntervals {

	static List<ArrayList<Integer>> finalList = new ArrayList<ArrayList<Integer>>();

	public int[][] merge(int[][] intervals) {

		int[][] finalMergedIntervalArray = null;

		for (int i = 0; i <= intervals.length - 1;) {
			int[] previousArray = intervals[i];
			int[] indArray = intervals[i + 1];
			int lowerLimitNo = previousArray[0];
			int upperLimitNo = indArray[indArray.length - 1];
			boolean merge = false;

			for (int z = previousArray[0]; z <= previousArray[previousArray.length - 1]; z++) {
				if (z == indArray[0]) {
					ArrayList<Integer> toddList = new ArrayList<Integer>();
					toddList.add(lowerLimitNo);
					toddList.add(upperLimitNo);
					finalList.add(toddList);
					i += 2;
					merge = true;
					break;
				}
			}

			if (!merge) {
				ArrayList<Integer> toddList = new ArrayList<Integer>();
				toddList.add(previousArray[0]);
				toddList.add(previousArray[1]);
				finalList.add(toddList);

				toddList = new ArrayList<Integer>();
				toddList.add(indArray[0]);
				toddList.add(indArray[1]);
				finalList.add(toddList);
				i += 2;
				merge = false;
			}

//			int[] returnedArray = mergeArray(previousArray, indArray);
//
//			if (returnedArray[0] == lowerLimitNo && returnedArray[returnedArray.length - 1] == upperLimitNo) {
//				ArrayList<Integer> toddList = new ArrayList<Integer>();
//				toddList.add(lowerLimitNo);
//				toddList.add(upperLimitNo);
//				finalList.add(toddList);
//				i += 2;
//			}else {
//				ArrayList<Integer> toddList = new ArrayList<Integer>();
//				toddList.add(previousArray[0]);
//				toddList.add(previousArray[1]);
//				finalList.add(toddList);
//				
//				toddList = new ArrayList<Integer>();
//				toddList.add(indArray[0]);
//				toddList.add(indArray[1]);
//				finalList.add(toddList);
//				i+=2;
//			}

		}

		finalMergedIntervalArray = new int[finalList.size()][2];

		int rowIndex = 0;
		for (ArrayList<Integer> indList : finalList) {
			int colIndex = 0;
			for (Integer num : indList) {
				finalMergedIntervalArray[rowIndex][colIndex] = num;
				colIndex++;
			}
			rowIndex++;
		}

		return finalMergedIntervalArray;
	}

	public int[] mergeArray(int[] nums1, int[] nums2) {
		int i = 0, j = 0, k = 0;
		int left = nums1.length;
		int right = nums2.length;
		int[] finalArray = new int[left + right];

		while (i < left && j < right) {
			if (nums1[i] < nums2[j]) {
				finalArray[k] = nums1[i];
				k++;
				i++;
			} else if (nums2[j] < nums1[i]) {
				finalArray[k] = nums2[j];
				k++;
				j++;
			} else {
				finalArray[k] = nums1[i];
				k++;
				i++;
				j++;
			}
		}

		if (i < left) {
			for (int p = i; p < left; p++) {
				finalArray[k] = nums1[i];
				k++;
				i++;
			}
		}

		if (j < right) {
			for (int p = j; p < right; p++) {
				finalArray[k] = nums2[j];
				k++;
				j++;
			}
		}

		return finalArray;
	}

	public static void main(String[] args) {
		MergeIntervals mIObj = new MergeIntervals();
		int[][] inputArray = { { 1, 4 }, { 4, 5 } };
		int[][] finalMergedIntervalArray = mIObj.merge(inputArray);

		for (int i = 0; i < finalMergedIntervalArray.length; i++) {
			System.out.println();
			for (int j = 0; j < finalMergedIntervalArray[i].length; j++) {
				System.out.println(finalMergedIntervalArray[i][j]);
			}
		}

	}

}
