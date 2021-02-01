package Strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	static Map<String, Integer> values = new HashMap<>();

	static {
		values.put("M", 1000);
		values.put("D", 500);
		values.put("C", 100);
		values.put("L", 50);
		values.put("X", 10);
		values.put("V", 5);
		values.put("I", 1);
	}

	public static int romanToInt2(String s) {
		int sum = 0;
		int i = 0;
		while (i < s.length()) {
			if (values.get(String.valueOf(s.charAt(i))) < values.get(String.valueOf(s.charAt(i + 1)))) {
				sum += values.get(String.valueOf(s.charAt(i + 1))) - values.get(String.valueOf(s.charAt(i)));
				i += 2;
			} else {
				sum += values.get(String.valueOf(s.charAt(i)));
				i++;
			}
		}

		return sum;
	}

	public static int romanToInt(String s) {

		int sum = 0;
		int i = 0;
		while (i < s.length()) {
			String currentSymbol = s.substring(i, i + 1);
			int currentValue = values.get(currentSymbol);
			int nextValue = 0;
			if (i + 1 < s.length()) {
				String nextSymbol = s.substring(i + 1, i + 2);
				nextValue = values.get(nextSymbol);
			}

			if (currentValue < nextValue) {
				sum += (nextValue - currentValue);
				i += 2;
			} else {
				sum += currentValue;
				i += 1;
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		String str = "MMMCMXCIX";
		int result = romanToInt2(str);
		System.out.println(result);
	}

}
