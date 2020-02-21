package com.corejava.algorithms;

public class PalindromePartition {

	public static void main(String[] args) {
		String str = "noition";

		int len = str.length();
		int pointer = 0;

		while (pointer < len) {
			for (int i = pointer; i <= len; i++) {

				String consideredString = str.substring(pointer, i);
				if (!consideredString.isEmpty()
						&& new StringBuffer(consideredString).reverse().toString().equals(consideredString))
					System.out.println(consideredString);
			}
			pointer++;
		}
	}
}
