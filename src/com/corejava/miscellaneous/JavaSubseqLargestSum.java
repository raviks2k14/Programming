package com.corejava.miscellaneous;

public class JavaSubseqLargestSum {

	public int getLargestSubSequence(int[] inputArray) {
		String str = "";
		int finalSum = 0;
		int sum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			sum = inputArray[i];
			for (int j = i + 1; j < inputArray.length; j++) {
				sum += inputArray[j];
				if (sum > finalSum) {
					finalSum = sum;
					str = "Indexes having largest subsequence is between " + i + ", " + j;
				}
			}
			sum = 0;
		}
		System.out.println(str);
		return finalSum;
	}

	public static void main(String[] args) {
		JavaSubseqLargestSum obj = new JavaSubseqLargestSum();
		int[] testArray = new int[] { 6, 50, -9, -17, 12, 19 };
		System.out.println(obj.getLargestSubSequence(testArray));
	}

}
