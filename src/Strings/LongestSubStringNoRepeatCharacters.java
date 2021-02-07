package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestSubStringNoRepeatCharacters {

	public String getLongestSubString(String testString) {

		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < testString.length(); i++) {
			for (int j = testString.length() - 1; j > i; j--) {
				String suStr = testString.substring(i, j);
				if (!(checkDuplicatesStr(suStr))) {
					al.add(suStr);
				}
			}
		}
		int maximumIndex = 0;
		for (int m = 0; m < al.size(); m++) {
			if (al.get(m).length() > maximumIndex) {
				maximumIndex = al.get(m).length();
			}
		}
		return al.get(maximumIndex);
	}

	public boolean checkDuplicatesStr(String str) {
		char[] chArray = str.toCharArray();
		Arrays.sort(chArray);
		for (int i = 0; i < chArray.length - 1; i++) {
			if (chArray[i] != chArray[i + 1])
				continue;
			else
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		LongestSubStringNoRepeatCharacters ls = new LongestSubStringNoRepeatCharacters();
		String testString = "pwwkew";
		System.out.println(ls.getLongestSubString(testString));
	}

}
