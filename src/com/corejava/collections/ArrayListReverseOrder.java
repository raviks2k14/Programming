package com.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverseOrder {

	public static void main(String[] args) {
		List<String> alist = new ArrayList<String>();
		alist.add("ABC");
		alist.add("DEF");
		alist.add("GHI");
		alist.add("JKL");
		alist.add("MNO");
		
		System.out.println("ArrayList content before reversing its order\n");
		
		for(String str : alist){
			System.out.println(str);
		}
		
		System.out.println("\nArraylist in reversed order using reverseOrder() method\n");
		
		Collections.sort(alist, Collections.reverseOrder());
		
		for(String str : alist){
			System.out.println(str);
		}
		
		System.out.println("\nArraylist in reversed order using Collections.reverse() method\n");
		
		Collections.reverse(alist);
		
		for(String str : alist){
			System.out.println(str);
		}
	}

}
