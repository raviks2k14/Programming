package Miscellaneous;

public class JavaPalindromeWithSpecials {

	
	public boolean isPalindrome(String testString) {
		String str = testString.toLowerCase().trim();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}
		str = sb.toString();
		String str2 = sb.reverse().toString();
		return str.equals(str2);
	}
	
	public static void main(String[] args) {
		JavaPalindromeWithSpecials jp = new JavaPalindromeWithSpecials();
		String str = "race a car";
		System.out.println(jp.isPalindrome(str));
	}

}
