package Recursion;

public class Fibonacci {

	static int result = 0;
	static int a = 0;
	static int b = 1;

	// This yields to time complexity of 2powern
	static int fibonacciRecursive(int n) {

		if (n <= 1) {
			return n;
		}

		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

	}

	static int fibonacciIterative(int n) {

		for (int i = 0; i < n; i++) {
			result = a + b;
			a = b;
			b = result;
			System.out.println("Result : " + result);
		}

		return result;
	}

	public static void main(String[] args) {
		int n = 8;
		System.out.println(fibonacciRecursive(n));
		// System.out.println(fibonacciIterative(n));
	}

}
