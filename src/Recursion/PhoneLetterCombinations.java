package Recursion;

import java.util.*;

public class PhoneLetterCombinations {

	static HashMap<Character, char[]> dict = new HashMap<Character, char[]>();

	static {
		dict.put('2', new char[] { 'a', 'b', 'c' });
		dict.put('3', new char[] { 'd', 'e', 'f' });
		dict.put('4', new char[] { 'g', 'h', 'i' });
		dict.put('5', new char[] { 'j', 'k', 'l' });
		dict.put('6', new char[] { 'm', 'n', 'o' });
		dict.put('7', new char[] { 'p', 'q', 'r', 's' });
		dict.put('8', new char[] { 't', 'u', 'v' });
		dict.put('9', new char[] { 'w', 'x', 'y', 'z' });
	}

	public List<String> letterCombinationsNew(String digits) {
		List<String> result = new ArrayList<String>();
		result = letterCombinationsUtilNew(digits);
		System.out.println(result.toString());
		return result;
	}

	private List<String> letterCombinationsUtilNew(String digits) {
		List<String> result = new ArrayList<String>();
		if (digits.length() == 0) {
			result.add("");
		} else {
			char c = digits.charAt(digits.length() - 1);
			char[] chrArray = dict.get(c);
			List<String> tempList = letterCombinationsUtilNew(digits.substring(0, digits.length() - 1));

			for (String s : tempList) {
				for (char inputChar : chrArray) {
					result.add(s + String.valueOf(inputChar));
				}
			}

		}

		return result;
	}

	public static void main(String[] args) {
		PhoneLetterCombinations plcObj = new PhoneLetterCombinations();
		plcObj.letterCombinationsNew("23");

	}

}
