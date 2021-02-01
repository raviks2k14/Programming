package Algorithms;

import java.util.ArrayList;

public class TripletCountLessThanSum {

	static int[] arr = { 5, 1, 3, 4, 7 };
	static int sum = 12;

	public static void main(String[] args) {
		getTriplets(arr, sum);
	}

	public static ArrayList<ArrayList<Integer>> getTriplets(int[] arr, int sum) {
		ArrayList<ArrayList<Integer>> triplets = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> tripletsListFinal = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> individualList = null;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					individualList = new ArrayList<Integer>();
					individualList.add(arr[i]);
					individualList.add(arr[j]);
					individualList.add(arr[k]);
					triplets.add(individualList);
				}
			}
		}

		for (ArrayList<Integer> iList : triplets) {
			int iSum = 0;
			for (Integer iNum : iList) {
				iSum = iSum + iNum;
			}

			if (iSum < sum) {
				tripletsListFinal.add(iList);
			}
		}

		System.out.println(tripletsListFinal);

		return tripletsListFinal;
	}

}
