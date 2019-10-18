package com.corejava.strings;

public class CountWordsInString {

	public static void main(String[] args) {

		String str = "At first glance, your code will not compile. Since the nested if statement doesn't have any braces, it will consider the next line the code that it should execute. Also, you are comparing a char against a String, . Try comparing the values as chars instead. I think the correct syntax would be:";
		System.out.println("Sentence : " + str);
		int wordCount = returnWordCount(str);
		System.out.println("The number of words in the above sentence is : "
				+ wordCount);
	}

	public static int returnWordCount(String str) {
		int wordCount = 0;
		char chr[] = new char[str.length()];
		for (int i = 0; i < chr.length; i++) {
			chr[i] = str.charAt(i);
			// check for consecutive whitespace
			if (i > 0 && Character.isWhitespace(chr[i - 1])
					&& Character.isWhitespace(chr[i])) {
				continue;
			}
			// increment count only if you find a whitespace and when the
			// control reaches the end of string
			if (((i > 0) && (Character.isWhitespace(chr[i])))
					|| (i == str.length() - 1)) {
				wordCount++;
			}
		}

		return wordCount;
	}

}
