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
		// withCollections(str1Array, str2Array);
		withOutCollections(str1Array, str2Array);

	}

	public static void withCollections(String str1Array[], String str2Array[]) {
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

	public static void withOutCollections(String str1Array[],
			String str2Array[]) {

		String str3[] = new String[str1Array.length + str2Array.length];
		String str4[] = new String[str3.length];

		try {
			for (int i = 0; i < str1Array.length; i++) {
				str3[i] = str1Array[i];
			}

			for (int i = 0; i < str2Array.length; i++) {
				str3[str1Array.length + i] = str2Array[i];
			}
			int k = 0;
			for (int j = 0; j < str3.length; j++) {
				boolean present = false;

				for (int p = 0; p < str4.length; p++) {
					if (str3[j].equals(str4[p])) {
						present = true;
					}
				}

				if (!present) {
					str4[k] = str3[j];
					k++;
				}

				present = false;

			}

			System.out.println("The final array with no duplicates : "
					+ Arrays.toString(str4));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
