package com.corejava.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBasics {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		alist.add("Ravi");
		alist.add("Greeshu");
		alist.add("Pratibha");
		alist.add("Appaji");
		alist.add("Mummy");
		alist.add("Pavan");

		for (String str : alist) {
			System.out.println(str);
		}

		System.out.println(alist.get(3));

		ArrayList<String> clist1 = (ArrayList<String>) alist.clone();

		System.out.println("Cloned Arraylist : "+clist1);

		alist.add(6, "New member");

		System.out.println("Original Arraylist : "+alist);
		
		System.out.println(alist.contains("Ravi"));
		
		alist.ensureCapacity(6);
		
		alist.add(7, "New member");
		
		System.out.println("Original Arraylist : "+alist);
		
//		alist.clear();
//		
//		System.out.println("Original Arraylist : "+alist);
		
		List<String> subList = alist.subList(0, 2);
		
		System.out.println("Sub list : "+subList);
		
		String strArray[] = alist.toArray(new String[alist.size()]);
		
		System.out.println("String Array : "+strArray.length);
		
		List<String> newList = Arrays.asList(strArray);
		
		System.out.println("List : "+newList);
		
	}

}
