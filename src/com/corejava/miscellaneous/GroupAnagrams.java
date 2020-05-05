package com.corejava.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagrams {

	ArrayList<ArrayList<String>> finalArrayList = null;

	public ArrayList<ArrayList<String>> groupAnagramsMethod(String[] inputString) {
		finalArrayList = new ArrayList<ArrayList<String>>();
		ArrayList<String> al = null;
		for (int i = 0; i < inputString.length; i++) {
			boolean present = false;
			for (ArrayList<String> lp1 : finalArrayList) {
				if (lp1.contains(inputString[i])) {
					present = true;
				}
			}
			if (!present) {
				al = new ArrayList<String>();
				al.add(inputString[i]);
				char chr1[] = inputString[i].toCharArray();
				Arrays.sort(chr1);
				String str1 = Arrays.toString(chr1);
				for (int j = i + 1; j < inputString.length; j++) {
					char chr2[] = inputString[j].toCharArray();
					Arrays.sort(chr2);
					String str2 = Arrays.toString(chr2);
					if (str1.equals(str2)) {
						al.add(inputString[j]);
					}
				}
				finalArrayList.add(al);
			}
		}
		return finalArrayList;
	}

	public static void main(String[] args) {
		GroupAnagrams ga = new GroupAnagrams();
		String[] str = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(ga.groupAnagramsMethod(str).toString());
	}

}
