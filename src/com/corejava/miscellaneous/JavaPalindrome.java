package com.corejava.miscellaneous;

public class JavaPalindrome {

	public static void main(String[] args) {
		// withLibraryMethods("Deleveled");
		// withoutLibraryMethods("Deleveled");
		//usingWhile("Deleveled");
		isPalindrome(121);
	}

	public static void withLibraryMethods(String str) {
		StringBuffer sbuf = new StringBuffer(str);
		String reversedStr = sbuf.reverse().toString();
		System.out
				.println("(withLibraryMethods) Is the string a palindrome? : "
						+ str.equalsIgnoreCase(reversedStr));
	}

	public static void withoutLibraryMethods(String str) {
		String originalStr = str;
		StringBuffer sbuf = new StringBuffer();
		for (int i = originalStr.length() - 1; i >= 0; i--) {
			char c = originalStr.charAt(i);
			sbuf.append(c);
		}
		System.out
				.println("(withoutLibraryMethods) Is the string a palindrome? : "
						+ originalStr.equalsIgnoreCase(sbuf.toString()));
	}
	
	public static void usingWhile(String str) {
		String origStr = str.toLowerCase();
		int i=0;
		int j = str.length()-1;
		boolean palindrome=true;
		while(i<j) {
			if(origStr.charAt(i)==origStr.charAt(j)) {
				i++;
				j--;
			}else {
				palindrome=false;
				return;
			}
		}
		System.out
				.println("(usingWhile) Is the string a palindrome? : "
						+palindrome);
	}

	public static void isPalindrome(int number) {
		int palindrome = number; // copied number into variable
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			System.out.println("Remainder : " + remainder);
			reverse = reverse * 10 + remainder;
			System.out.println("Reverse : " + reverse);
			palindrome = palindrome / 10;
			System.out.println("Palindrome : " + palindrome);
			
			
			System.out.println("----------------------------------------------");
		}

		// if original and reverse of number is equal means
		// number is palindrome in Java
		if (number == reverse) {
			System.out.println("Is the number " + number + " a palindrome? : "
					+ true);
		} else {
			System.out.println("Is the number " + number + " a palindrome? : "
					+ false);
		}
	}

}
