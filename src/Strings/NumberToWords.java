package Strings;

import java.util.*;

public class NumberToWords {

	static Map<Integer, HashMap<Integer, String>> firstDegreeMap = new HashMap<Integer, HashMap<Integer, String>>();
	static Map<Integer, String> secondDegreeMap = new HashMap<Integer, String>();
	static Map<Integer, String> thirdDegreeMap = new HashMap<Integer, String>();
	static Map<Integer, String> forthDegreeMap = new HashMap<Integer, String>();

	static {
		secondDegreeMap.put(0, "");
		secondDegreeMap.put(1, "");
		secondDegreeMap.put(2, "Hundred");
		secondDegreeMap.put(3, "Thousand");
		
		thirdDegreeMap.put(2, "Twenty");
		thirdDegreeMap.put(3, "Thirty");
		thirdDegreeMap.put(4, "Forty");
		thirdDegreeMap.put(5, "Fifty");
		thirdDegreeMap.put(6, "Sixty");
		thirdDegreeMap.put(7, "Seventy");
		thirdDegreeMap.put(8, "Eighty");
		thirdDegreeMap.put(9, "Ninty");
		
		forthDegreeMap.put(0, "");
		forthDegreeMap.put(1, "One");
		forthDegreeMap.put(2, "Two");
		forthDegreeMap.put(3, "Three");
		forthDegreeMap.put(4, "Four");
		forthDegreeMap.put(5, "Five");
		forthDegreeMap.put(6, "Six");
		forthDegreeMap.put(7, "Seven");
		forthDegreeMap.put(8, "Eight");
		forthDegreeMap.put(9, "Nine");
		forthDegreeMap.put(10, "Ten");
		forthDegreeMap.put(11, "Eleven");
		forthDegreeMap.put(12, "Twelve");
		forthDegreeMap.put(13, "Thirteen");
		forthDegreeMap.put(14, "Fourteen");
		forthDegreeMap.put(15, "Fifteen");
		forthDegreeMap.put(16, "Sixteen");
		forthDegreeMap.put(17, "Seventeen");
		forthDegreeMap.put(18, "Eighteen");
		forthDegreeMap.put(19, "Nineteen");

	}

	static void getWordings(Integer input) {
		String inputString = Integer.toString(input);
		int i = 0;
		int degree = 0;
		StringBuffer sb = new StringBuffer();
		while (i < inputString.length()) {
			degree = inputString.length() - 1 - i;

			if (degree >= 2) {
				if (Integer.parseInt(Character.toString(inputString.charAt(i))) != 0) {
					sb.append(" ")
							.append(forthDegreeMap.get(Integer.parseInt(Character.toString(inputString.charAt(i))))
									+ " " + secondDegreeMap.get(degree));
				}
			} else if (degree == 1) {
				Integer twoDigitData = Integer.parseInt(inputString.substring(i));
				if (twoDigitData < 20) {
					sb.append(" ").append(forthDegreeMap.get(twoDigitData));
					break;
				} else {
					sb.append(" ").append(thirdDegreeMap.get(twoDigitData / 10));
				}
			} else {
				sb.append(" ").append(forthDegreeMap.get(Integer.parseInt(Character.toString(inputString.charAt(i)))));
			}
			i++;
		}

		System.out.println("\nThe wording is :" + sb.toString());
	}

	public static void main(String[] args) {
		Integer number = 547890;

		getWordings(number);

	}

}
