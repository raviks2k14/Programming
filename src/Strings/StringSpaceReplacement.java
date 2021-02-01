package Strings;

public class StringSpaceReplacement {
	static int spaceCount = 0;

	StringSpaceReplacement(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isSpaceChar(str.charAt(i))) {
				spaceCount++;
			}
		}
	}

	public String replaceSpace(String strToReplace, char[] charArray, String spaceReplacementEntity) {

		int charArrayPointer = 0;
		for (int stringCounter = 0; stringCounter < strToReplace.length(); stringCounter++) {
			if (!Character.isSpaceChar(strToReplace.charAt(stringCounter))) {
				charArray[charArrayPointer] = strToReplace.charAt(stringCounter);
				charArrayPointer++;
			} else {
				for (int charArrayCounter = 0; charArrayCounter < spaceReplacementEntity.length(); charArrayCounter++) {
					charArray[charArrayPointer] = spaceReplacementEntity.charAt(charArrayCounter);
					charArrayPointer++;
				}
			}

		}
		return String.valueOf(charArray).trim();
	}

	public static void main(String[] args) {
		String strToReplace = "My dear  daughter is studying in Kindergarten";
		String spaceReplacementEntity = "%20";
		StringSpaceReplacement clsObj = new StringSpaceReplacement(strToReplace);
		char charArray[] = new char[strToReplace.length() + (spaceReplacementEntity.length() * spaceCount)];
		System.out.println(
				"The source string : " + strToReplace);
		System.out.println(
				"The Space replaced string : " + clsObj.replaceSpace(strToReplace, charArray, spaceReplacementEntity));
	}

}
