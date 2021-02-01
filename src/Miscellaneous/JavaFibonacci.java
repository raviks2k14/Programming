package Miscellaneous;

public class JavaFibonacci {

	public static void main(String[] args) {
		fibonacciImplementation(0);
	}

	public static void fibonacciImplementation(int startValue) {

		int limit = 20;
		int initialVal = startValue;
		int nextVal = initialVal + 1;

		StringBuffer sbuf = new StringBuffer();
		sbuf.append(initialVal);
		for (int i = 0; i < limit; i++) {
			if (i == 0) {
				sbuf.append("," + nextVal);
			}
			int resultVal = initialVal + nextVal;
			initialVal = nextVal;
			nextVal = resultVal;

			sbuf.append("," + resultVal);

		}

		System.out.println(sbuf);
	}

}
