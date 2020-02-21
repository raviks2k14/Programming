package com.corejava.stack;

import java.util.Stack;

public class StackPrefixEvaluation {

	public int evaluatePrefix(String postFixString) {
		String postfixString = postFixString;
		Stack<Integer> stk = new Stack<Integer>();
		int a = 0;
		int b = 0;
		int k = postfixString.length();
		for (int i = k - 1; i >= 0; i--) {
			if (postfixString.charAt(i) == '+') {
				a = stk.pop();
				b = stk.pop();
				stk.push(a + b);
			} else if (postfixString.charAt(i) == '-') {
				a = stk.pop();
				b = stk.pop();
				stk.push(a - b);
			} else if (postfixString.charAt(i) == '*') {
				a = stk.pop();
				b = stk.pop();
				stk.push(a * b);
			} else if (postfixString.charAt(i) == '/') {
				a = stk.pop();
				b = stk.pop();
				stk.push(a / b);
			} else {
				stk.push(Integer.parseInt(String.valueOf((postfixString.charAt(i)))));
			}
		}
		return stk.pop();
	}

	public static void main(String args[]) {
		StackPrefixEvaluation obj = new StackPrefixEvaluation();
		String postFixString = "-+8/632";
		System.out.println(obj.evaluatePrefix(postFixString));
	}

}
