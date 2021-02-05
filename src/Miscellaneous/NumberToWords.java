package Miscellaneous;

public class NumberToWords {

	public static String getWords(char[] charNum) {

		if (charNum.length == 0) {
			return "Invalid input";
		}

		if (charNum.length > 4) {
			return "Digits greater than 4 is not supported";
		}

		String[] first = new String[] { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
				"Ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen" };

		String[] second = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninty" };

		String[] third = new String[] { "", "", "hundred", "thousand" };

		int i = 0;
		StringBuffer sb = new StringBuffer();

		while (i < charNum.length) {
			int k = charNum.length - 1 - i;
			if (k == 1) {

				String str = Character.toString(charNum[i]) + Character.toString(charNum[i + 1]);

				if (Integer.parseInt(str) < 20) {
					sb.append(" ").append(first[Integer.parseInt(str)]);
					return sb.toString().toUpperCase();
				} else {
					sb.append(" ").append(second[charNum[i] - '0']);
				}
			} else if (k == 0) {
				sb.append(" ").append(first[charNum[i] - '0']);
			} else {
				sb.append(" ").append(first[charNum[i] - '0']).append(" ").append(third[k]);
			}
			i++;
		}
		return sb.toString().toUpperCase();
	}

	public static void main(String[] args) {
		Integer number = 1096;
		System.out.println(getWords(number.toString().toCharArray()));
	}

}
