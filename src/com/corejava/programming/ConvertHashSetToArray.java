package com.corejava.programming;

import java.util.HashSet;

public class ConvertHashSetToArray {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("ABC");
		hashSet.add("DEF");
		hashSet.add("GHI");
		hashSet.add("JKL");
		hashSet.add("MNO");
		
		String strArray[] = hashSet.toArray(new String[hashSet.size()]);
		
		for(String str : strArray){
			System.out.println(str);
		}
	}

}
