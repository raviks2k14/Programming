package com.corejava.stack;

import java.util.Stack;

public class StackPostfixEvaluation {

	public int evaluatePostfix(String postFixString) {
		String postfixString = postFixString;
		Stack<Integer> stk = new Stack<Integer>();
		int a = 0;
		int b = 0;
		for (int i = 0; i < postfixString.length(); i++) {
			if (postfixString.charAt(i) == '+') {
				a = stk.pop();
				b = stk.pop();
				stk.push(b + a);
			} else if (postfixString.charAt(i) == '-') {
				a = stk.pop();
				b = stk.pop();
				stk.push(b - a);
			} else if (postfixString.charAt(i) == '*') {
				a = stk.pop();
				b = stk.pop();
				stk.push(b * a);
			} else if (postfixString.charAt(i) == '/') {
				a = stk.pop();
				b = stk.pop();
				stk.push(b / a);
			} else {
				stk.push(Integer.parseInt(String.valueOf((postfixString.charAt(i)))));
			}
		}
		return stk.pop();
	}

	public static void main(String args[]) {
		StackPostfixEvaluation obj = new StackPostfixEvaluation();
		String postFixString = "53+82-*";
		System.out.println(obj.evaluatePostfix(postFixString));
	}

}
