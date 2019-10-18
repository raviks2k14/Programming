package com.corejava.programming;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortingComparator {

	public static void main(String[] args) {
		ArrayList<StudentComparator> arraylist = new ArrayList<StudentComparator>();
		arraylist.add(new StudentComparator(333, "Messi", 30));
		arraylist.add(new StudentComparator(222, "Ronaldo", 31));
		arraylist.add(new StudentComparator(111, "John", 29));

		/* Sorting based on Student Name */
		System.out.println("Student Name Sorting:\n");
		Collections.sort(arraylist, StudentComparator.StuNameComparator);

		for (StudentComparator str : arraylist) {
			System.out.println(str);
		}

		/* Sorting on Rollno property */
		System.out.println("\nRollNum Sorting:\n");
		Collections.sort(arraylist, StudentComparator.StuRollno);
		for (StudentComparator str : arraylist) {
			System.out.println(str);
		}
	}

}
