package Strings;

import java.util.ArrayList;

public class StringPermutations {
	String strPermutation;
	ArrayList<String> arrayList;

	StringPermutations(String str) {
		strPermutation = str;
		arrayList = new ArrayList<String>();
		generatePermutations();
	}

	public void generatePermutations() {
		for (int i = 0; i < strPermutation.length(); i++) {
			for (int j = 0; j < strPermutation.length(); j++) {
				for (int k = 0; k < strPermutation.length(); k++) {
					if (strPermutation.charAt(i) != strPermutation.charAt(j)) {
						if ((strPermutation.charAt(j) != strPermutation.charAt(k))
								&& (strPermutation.charAt(i) != strPermutation.charAt(k))) {
							arrayList.add((new StringBuffer().append(strPermutation.charAt(i))
									.append(strPermutation.charAt(j)).append(strPermutation.charAt(k))).toString());
						}
					}
				}
			}
		}
		System.out.println("Permutations of "+strPermutation+" : "+arrayList.toString());
	}

	public boolean validateStringForPermutations(String testString) {

		for (String str : arrayList) {
			if (testString.contains(str)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		StringPermutations clsObj = new StringPermutations("abc");
		String testString = "decabtgh";
		System.out.println("Does the string " + "\"" + testString + "\"" + " contain permutation of " + "\""
				+ clsObj.strPermutation + "\"" + "? : " + clsObj.validateStringForPermutations(testString));
	}

}
