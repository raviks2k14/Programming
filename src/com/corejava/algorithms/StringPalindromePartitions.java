package com.corejava.algorithms;

import java.util.ArrayList;

public class StringPalindromePartitions {

	public static void main(String[] args) {
		String inputString = "noition";
		ArrayList<String> palindromeList = getPalindromeList(inputString);
		System.out.println("The final palindrome list of the String " + "\'" + inputString + "\'" + " : ");
		for(String str : palindromeList) {
			System.out.println(str);
		}
	}

	public static ArrayList<String> getPalindromeList(String inputString) {
		ArrayList<String> finalPalindromeList = new ArrayList<String>();
		ArrayList<ArrayList<String>> finalIndividualPalindromeList = new ArrayList<ArrayList<String>>();
		int strLength = inputString.length();

		for (int i = 0; i < inputString.length(); i++) {
			ArrayList<String> individualPalindromeList = new ArrayList<String>();
			for (int j = strLength; j > i; j--) {
				String subStr = inputString.substring(i, j);
				individualPalindromeList.add(subStr);
			}
			finalIndividualPalindromeList.add(individualPalindromeList);
		}

		for (ArrayList<String> aList : finalIndividualPalindromeList) {
			for (String str : aList) {
				boolean isStrPalindrome = isPalindrome(str);
				if (isStrPalindrome) {
					finalPalindromeList.add(str);
				}
			}
		}

		return finalPalindromeList;
	}

	public static boolean isPalindrome(String str) {

		if (str.length() == 1) {
			return true;
		} else {
			String originalString = str;
			String reversedString = getReversedString(str);
			if (originalString.equalsIgnoreCase(reversedString)) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static String getReversedString(String originalString) {
		return new StringBuffer(originalString).reverse().toString();
	}

}
