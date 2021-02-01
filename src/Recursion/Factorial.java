package Recursion;

public class Factorial {

	static int factorial(int number) {

		if (number == 0) {
			return 1;
		}else {
			return number * factorial(number - 1);
		}
	}

	public static void main(String[] args) {
		int number = 8;
		System.out.println(factorial(number));

	}

}
