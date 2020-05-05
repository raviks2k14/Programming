package com.corejava.miscellaneous;

public class StringToIntAtoi {

	static int myAtoi(String str) {

		str = str.trim();

		if (str == null || str.length() == 0) {
			return 0;
		}
		// Initialize result
		double result = 0;

		boolean isNegative = false;

		// Initialize index of first digit
		int startIndex = 0;

		// If number is negative, then
		// update sign
		if (str.charAt(0) == '-' || str.charAt(0) == '+') {
			// Update index of first digit
			startIndex++;
		}

		if (str.charAt(0) == '-') {
			isNegative = true;
		}

		for (int i = startIndex; i < str.length(); ++i) {

			// handle for non numeric characters
			if (str.charAt(i) < '0' || str.charAt(i) > '9') { // checking if ascii value is below or above 0 or 9
				break;
			}
			int digitValue = (int) (str.charAt(i) - '0');
			result = result * 10 + digitValue;
		}

		if (isNegative) {
			result = -result;
		}

		// handle underflow
		if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		// handle overflow
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}

		return (int) result;
	}

	public static void main(String[] args) {
		String str = "-91283472332";
		int val = myAtoi(str);
		System.out.println(val);
	}
}
