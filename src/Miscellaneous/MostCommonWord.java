package Miscellaneous;

import java.util.*;
import java.util.Map.Entry;

public class MostCommonWord {

	public String mostCommonWord(String paragraph, String[] banned) {

		if (paragraph == null || paragraph.length() == 0) {
			return "";
		}

		List<String> words = new ArrayList<String>();
		List<String> bannedList = Arrays.asList(banned);
		Map<String, Integer> strMap = new HashMap<String, Integer>();

		String ar[] = paragraph.split(" ");

		for (String s : ar) {
			words.add(s);

		}

		for (String eachword : words) {
			eachword = removePunctuations(eachword);
			if (!(bannedList.contains(eachword.toLowerCase())) || !(bannedList.contains(eachword.toLowerCase()))) {
				if (!(strMap.containsKey(eachword.toLowerCase()))) {
					strMap.put(eachword.toLowerCase(), 1);
				} else {
					int val = strMap.get(eachword.toLowerCase());
					val += 1;
					strMap.put(eachword.toLowerCase(), val);
				}
			}
		}

		int count = 0;
		String finalStr = "";
		for (Entry<String, Integer> entry : strMap.entrySet()) {
			if (entry.getValue() > count) {
				count = entry.getValue();
				finalStr = entry.getKey();
			}
		}
		return finalStr;
	}

	public String removePunctuations(String s) {
		String res = "";
		for (Character c : s.toCharArray()) {
			if (Character.isLetterOrDigit(c))
				res += c;
		}
		return res;
	}

	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = new String[] { "hit" };
		System.out.println(new MostCommonWord().mostCommonWord(paragraph, banned));
	}

}
