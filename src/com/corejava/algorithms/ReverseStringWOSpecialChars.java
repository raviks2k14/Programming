package com.corejava.algorithms;

public class ReverseStringWOSpecialChars {

	public static char[] reverseString(String strActual) {
		char[] chr = strActual.toCharArray();
		int l = 0, r = chr.length - 1;
		while (l < r) {
			if (!(Character.isAlphabetic(chr[l]))) {
				l++;
			} else if (!(Character.isAlphabetic(chr[r]))) {
				r--;
			} else {
				char chrToReplace = chr[l];
				chr[l] = chr[r];
				chr[r] = chrToReplace;
				l++;
				r--;
			}
		}
		return chr;
	}

	public static void main(String[] args) {
		String strActual = "Ab,c,de!$";
		char[] reversedChar = reverseString(strActual);
		String reversedStr = new String(reversedChar);
		System.out.println("Actual String : " + strActual);
		System.out.println("Reversed String : " + reversedStr);
	}

}
