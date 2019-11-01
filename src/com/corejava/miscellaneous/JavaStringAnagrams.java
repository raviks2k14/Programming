package com.corejava.miscellaneous;

import java.util.Arrays;

public class JavaStringAnagrams {

	public static void main(String[] args) {
		validateStringAnagram("mary", "Army");
	}

	public static void validateStringAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			System.out.println("The strings are not anagrams");
		} else {
			char chr1Array[] = str1.toCharArray();
			char chr2Array[] = str2.toCharArray();

			Arrays.sort(chr1Array);
			Arrays.sort(chr2Array);

			String str1Final = Arrays.toString(chr1Array);
			String str2Final = Arrays.toString(chr2Array);

			if (str1Final.equalsIgnoreCase(str2Final)) {
				System.out.println("The strings are anagrams");
			} else {
				System.out.println("The strings are not anagrams");
			}

		}
	}
}
