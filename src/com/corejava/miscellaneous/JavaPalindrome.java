package com.corejava.miscellaneous;

public class JavaPalindrome {

	public static void main(String[] args) {
		String str = "Deleveled";
		StringBuffer sbuf = new StringBuffer(str);
		String reversedStr = sbuf.reverse().toString();
		System.out.println("Is the string a plaindrome? : "
				+ str.equalsIgnoreCase(reversedStr));
	}

}
