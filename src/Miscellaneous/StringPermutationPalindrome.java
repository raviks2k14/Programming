package Miscellaneous;

public class StringPermutationPalindrome {

	static void printPermutn(String str, String ans) {

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
			//System.out.println("1 : "+str.substring(0, i));
			//System.out.println("2 : "+str.substring(i + 1));

			String ros = str.substring(0, i) + str.substring(i + 1);
			//System.out.println("3 : "+ros);
			
			//System.out.println("-----------------------------");
			// Recurvise call
			printPermutn(ros, ans + ch);
		}
	}

	public static void main(String[] args) {
		String s = "RAVI";
		printPermutn(s, "");
	}

}
