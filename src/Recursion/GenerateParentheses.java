package Recursion;

import java.util.*;

public class GenerateParentheses {

	public Set<String> generateParenthesis(int remaining) {
		Set<String> set = new HashSet<String>();

		if (remaining == 0) {
			set.add("");
		} else {
			Set<String> prev = generateParenthesis(remaining - 1);
			for (String str : prev) {
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == '(') {
						String s = insertInside(str, i);
						set.add(s);
					}
				}
				set.add("()" + str);
			}
		}

		return set;
	}

	public String insertInside(String str, int leftIndex) {
		String left = str.substring(0, leftIndex + 1);
		String right = str.substring(leftIndex + 1);
		return left + "()" + right;
	}

	public static void main(String[] args) {
		GenerateParentheses gpObj = new GenerateParentheses();
		Set<String> resultantSet = gpObj.generateParenthesis(3);
		for(String str : resultantSet) {
			System.out.print(str+", ");
		}
	}

}
