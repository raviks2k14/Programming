package com.corejava.sorting;

public class QuickSortProgramming {

	public static void main(String[] args) {
		int orgArray[] = new int[] { 9, 2, 5, 6, 4, 3, 7, 10, 1, 12, 8, 11 };
		int lowerArray[] = null;
		int higherArray[]= null;
		int pivot = orgArray[6];
		
		System.out.println("The pivot element is :"+pivot);

		for (int i = 0; i < orgArray.length; i++) {
			if(orgArray[i]<pivot){
				lowerArray[i]=orgArray[i];
			}else{
				higherArray[i]=orgArray[i];
			}
		}
		
		System.out.println("Lower Array : "+lowerArray);
		System.out.println("Higher Array : "+higherArray);

	}

}
