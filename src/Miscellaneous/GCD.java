package Miscellaneous;

public class GCD {

	static int getGCDIterative(int num1, int num2) {

		if (num1 % num2 == 0) {
			return num2;
		}
		while (num1 % num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num2;
	}

	static int getGCDRecursive(int num1, int num2) {

		if (num2 == 0) {
			return num1;
		}

		return getGCDRecursive(num2, num1 % num2);

	}

	public static void main(String[] args) {
		System.out.println(getGCDIterative(12332, 8642));
		System.out.println(getGCDRecursive(12332, 8642)); 
	}

}
