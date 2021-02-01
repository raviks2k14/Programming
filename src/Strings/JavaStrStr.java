package Strings;

public class JavaStrStr {

	public int strStr(String haystack, String needle) {
		
		if ((haystack == null || haystack.length() == 0) && (needle == null || needle.length() == 0))  {
			return 0;
		}

		if (haystack == null || haystack.length() == 0) {
			return 0;
		}

		if (needle == null || needle.length() == 0) {
			return 0;
		}

		if (!(haystack.contains(needle))) {
			return -1;
		}
		return haystack.indexOf(needle);
	}

	public static void main(String[] args) {
		System.out.println(new JavaStrStr().strStr("hello", "ll"));
		System.out.println(new JavaStrStr().strStr("aaaaa", "bba"));
	}

}
