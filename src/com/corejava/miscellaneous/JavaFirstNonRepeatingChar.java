package com.corejava.miscellaneous;

public class JavaFirstNonRepeatingChar {

	public int getFirstNonRepeatingChar(String testString) {

		for (int i = 0; i < testString.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < testString.length(); j++) {
				if (testString.charAt(i) == testString.charAt(j)) {
					count++;
				}
				if (count > 0) {
					break;
				}
			}
			if (count == 0) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		JavaFirstNonRepeatingChar fnc = new JavaFirstNonRepeatingChar();
		String testString = "ravikumar";
		System.out.println(fnc.getFirstNonRepeatingChar(testString));
	}

}
