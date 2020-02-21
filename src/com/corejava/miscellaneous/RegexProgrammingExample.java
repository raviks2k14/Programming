package com.corejava.miscellaneous;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProgrammingExample {
	private static String REGEX = "dog";
	private static String INPUT = "The dog says Meow. All dogs says Meow";
	private static String REPLACE = "cat";

	public static void main(String[] args) {

		Pattern ptrn = Pattern.compile(REGEX);
		Matcher mtchr = ptrn.matcher(INPUT);
		System.out.println(mtchr.matches());
		INPUT = mtchr.replaceAll(REPLACE);
		System.out.println(INPUT);

	}

}
