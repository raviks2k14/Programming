package com.corejava.miscellaneous;

public class JavaFactorial {

	public static void main(String[] args) {
		factorialOfNumber(3);
	}

	public static void factorialOfNumber(int number) {

		int factorialVal = number;

		for (int i = 1; i < number; i++) {
			factorialVal = factorialVal * (number - i);
		}

		System.out.println("The factorial of given number " + number + " is : "
				+ factorialVal);
	}

}
