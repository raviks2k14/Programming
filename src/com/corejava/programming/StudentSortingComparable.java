package com.corejava.programming;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortingComparable {

	public static void main(String[] args) {
		ArrayList<StudentComparable> arraylist = new ArrayList<StudentComparable>();
		arraylist.add(new StudentComparable(333, "John", 23));
		arraylist.add(new StudentComparable(222, "Messi", 29));
		arraylist.add(new StudentComparable(111, "Ronaldo", 31));

		Collections.sort(arraylist);

		System.out.println("Sorting based on comparable interface and on 'age' property of Student class");
		for (StudentComparable str : arraylist) {
			System.out.println(str);
		}

	}

}
