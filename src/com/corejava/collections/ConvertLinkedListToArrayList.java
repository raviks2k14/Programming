package com.corejava.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertLinkedListToArrayList {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("ABC");
		linkedList.add("DEF");
		linkedList.add("GHI");
		linkedList.add("JKL");
		linkedList.add("MNO");
		
		System.out.println("Before converting linked list to arraylist\n");
		
		for(String str : linkedList){
			System.out.println(str);
		}
		
		System.out.println("\nAfter converting linked list to arraylist\n");
		
		List<String> arrayList = new ArrayList<String>(linkedList);
		
		for(String str : arrayList){
			System.out.println(str);
		}
	}

}
