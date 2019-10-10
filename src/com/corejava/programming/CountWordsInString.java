package com.corejava.programming;

public class CountWordsInString {

	public static void main(String[] args) {

		String str = "Hi This is the sentence for which you need to count the number of words";
		System.out.println("Sentence :" + str);
		int wordCount = returnWordCount(str);
		System.out.println("The number of words in the above sentence is :"
				+ wordCount);
	}

	public static int returnWordCount(String str) {
		int wordCount = 0;

		char chr[] = new char[str.length()];
		System.out.println("Lenght of str :" + str.length());
		for (int i = 0; i < chr.length; i++) {
			chr[i] = str.charAt(i);
			System.out.println("Value of i :" + i);
			if (((i > 0) && (Character.isWhitespace(chr[i])))
					|| (i == str.length() - 1)) {
				wordCount++;
			}
		}

		return wordCount;
	}

}
