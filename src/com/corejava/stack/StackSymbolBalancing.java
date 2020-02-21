package com.corejava.stack;

import java.util.Stack;

public class StackSymbolBalancing {

	public boolean isSymbolsBalanced(String testString) {
		Stack<Character> stk = new Stack<Character>();
		String str = testString;

		if (str == null || str.length() == 0) {
			return true;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '}') {
				if (stk.isEmpty() || !(stk.peek() == '{')) {
					return false;
				} else {
					stk.pop();
				}
			} else if (str.charAt(i) == ']') {
				if (stk.isEmpty() || !(stk.peek() == '[')) {
					return false;
				} else {
					stk.pop();
				}
			} else if (str.charAt(i) == ')') {
				if (stk.isEmpty() || !(stk.peek() == '(')) {
					return false;
				} else {
					stk.pop();
				}
			} else {
				stk.push(str.charAt(i));
			}
		}
		if (stk.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		StackSymbolBalancing ssb = new StackSymbolBalancing();
		String testString = "[()]{}{[()()]()}";
		//String testString = "[(])";

		if (ssb.isSymbolsBalanced(testString)) {
			System.out.println("The String " + testString + " is balanced :)");
		} else {
			System.out.println("The String " + testString + " is NOT balanced :(");
		}
	}

}
