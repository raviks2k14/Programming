package com.corejava.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysMergeUniqueNames {

	public static void main(String[] args) {
		String str1Array[] = new String[] { "Ava", "Emma", "Olivia" };
		String str2Array[] = new String[] { "Olivia", "Sophia", "Emma" };

		try {

			System.out.println("Array 1 content : "
					+ Arrays.toString(str1Array));
			System.out.println("Array 2 content : "
					+ Arrays.toString(str2Array));

			List<String> al1 = new ArrayList<String>(Arrays.asList(str1Array));
			al1.addAll(Arrays.asList(str2Array));

			Set<String> hashSet = new HashSet<>(al1);

			Object objArray[] = new Object[hashSet.size()];
			objArray = hashSet.toArray();

			String finalArray[] = Arrays.copyOf(objArray, objArray.length,
					String[].class);

			System.out.println("The final array with no duplicates : "
					+ Arrays.toString(finalArray));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
