package Strings;

public class StringUniqueness {

	String testString;

	StringUniqueness(String str) {
		testString = str;
	}

	public boolean getUniqueness() {

		for (int i = 0; i < testString.length(); i++) {
			for (int j = i + 1; j < testString.length(); j++) {
				if (testString.charAt(i) == testString.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		StringUniqueness clsObj = new StringUniqueness("ravikum");
		System.out.println("Is the string equivalent : " + clsObj.getUniqueness());
	}

}
