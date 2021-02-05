package Recursion;

public class RecursiveMultiply {

	int minProduct(int a, int b) {
		int smaller = a < b ? a : b;
		int bigger = a < b ? b : a;
		return minProductHelper(smaller, bigger);
	}

	int minProductHelper(int smaller, int bigger) {
		if (smaller == 0) {
			return 0;
		}
		if (smaller == 1) {
			return bigger;
		}
		int s = smaller >> 1;
		int side1 = minProductHelper(s, bigger);
		int side2 = side1;
		if (smaller % 2 == 1) {
			side2 = minProductHelper(smaller - s, bigger);
		}
		return side1 + side2;
	}

	public static void main(String[] args) {
		RecursiveMultiply obj = new RecursiveMultiply();
		System.out.println(obj.minProduct(4, 6));

	}

}
