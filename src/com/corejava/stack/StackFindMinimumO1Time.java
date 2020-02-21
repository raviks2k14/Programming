package com.corejava.stack;

import java.util.Stack;

public class StackFindMinimumO1Time {
	Stack<Integer> srcStack = null;
	Stack<Integer> minStack = null;

	public StackFindMinimumO1Time() {
		srcStack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}

	public int getMinimum() {
		return minStack.peek();
	}

	public void push(int num) {
		int number = num;
		srcStack.push(number);
		if (minStack.isEmpty()) {
			minStack.push(number);
		} else {
			if (srcStack.peek() < minStack.peek()) {
				minStack.push(number);
			}
		}
	}

	public void pop() {
		if (srcStack.peek() == minStack.peek()) {
			srcStack.pop();
			minStack.pop();
		} else {
			srcStack.peek();
		}
	}

	public static void main(String[] args) {
		StackFindMinimumO1Time stkObj = new StackFindMinimumO1Time();
		stkObj.push(5);
		stkObj.push(3);
		System.out.println("The minimum value is : " + stkObj.getMinimum());
		stkObj.push(1);
		stkObj.push(9);
		System.out.println("The minimum value is : " + stkObj.getMinimum());
		stkObj.push(18);
		stkObj.push(6);
		System.out.println("The minimum value is : " + stkObj.getMinimum());
		stkObj.push(8);
		stkObj.push(2);
		System.out.println("The minimum value is : " + stkObj.getMinimum());
		stkObj.push(10);
		stkObj.push(0);
		System.out.println("The minimum value is : " + stkObj.getMinimum());
		stkObj.pop();
		stkObj.push(25);
		System.out.println("The minimum value is : " + stkObj.getMinimum());
	}

}
