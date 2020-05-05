package com.corejava.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaMinimumWindowSubString {

	public String getMinimumWindowSubString(String sourceString, String targetString) {
		ArrayList<String> al = new ArrayList<String>();
		int i = 0;
		while (i < sourceString.length()) {
			for (int j = sourceString.length(); j > i; j--) {
				String resStr = sourceString.substring(i, j);
				char chr[] = resStr.toCharArray();
				Arrays.sort(chr);
				StringBuilder sb = new StringBuilder();
				for (char c : chr) {
					sb.append(c);
				}
				String resStrSort = sb.toString();
				if (resStrSort.contains(targetString)) {
					al.add(resStr);
				}
			}
			i++;
		}

		String finalString = al.get(0);
		for (int j = 0; j < al.size(); j++) {
			if (al.get(j).length() < finalString.length()) {
				finalString = al.get(j);
			}
		}
		return finalString;
	}

	public static void main(String[] args) {
		JavaMinimumWindowSubString jmws = new JavaMinimumWindowSubString();
		String sourceString = "ADOBECODEBANC";
		String targetString = "ABC";
		System.out.println(jmws.getMinimumWindowSubString(sourceString, targetString));
	}

}
