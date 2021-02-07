package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagrams {

	ArrayList<ArrayList<String>> finalArrayList = null;

	public ArrayList<ArrayList<String>> groupAnagramsMethod9(String[] inputStringArray) {
		finalArrayList = new ArrayList<ArrayList<String>>();

		for (int i = 0; i < inputStringArray.length; i++) {

			boolean added = false;

			if (finalArrayList.size() == 0) {
				ArrayList<String> iList = new ArrayList<String>();
				iList.add(inputStringArray[i]);
				finalArrayList.add(iList);
				added = true;
				continue;
			} else {
				for (ArrayList<String> iList : finalArrayList) {

					char[] chr1 = iList.get(0).toCharArray();
					char[] chr2 = inputStringArray[i].toCharArray();

					Arrays.sort(chr1);
					Arrays.sort(chr2);

					String str1 = Arrays.toString(chr1);
					String str2 = Arrays.toString(chr2);

					if (str1.equalsIgnoreCase(str2)) {
						iList.add(inputStringArray[i]);
						added = true;
						break;
					}

				}
				if (!added) {
					ArrayList<String> iList = new ArrayList<String>();
					iList.add(inputStringArray[i]);
					finalArrayList.add(iList);
				}

			}
		}

		return finalArrayList;
	}

	public static void main(String[] args) {
		GroupAnagrams ga = new GroupAnagrams();
		String[] str = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(ga.groupAnagramsMethod9(str).toString());
	}

}
