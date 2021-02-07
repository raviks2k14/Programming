package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArraySum4On2 {

	static class Pair {
		int i, j = 0;

		Pair(int index1, int index2) {
			i = index1;
			j = index2;
		}
	}

	public List<ArrayList<Integer>> fourSum(int[] inputArray, int sum) {
		List<ArrayList<Integer>> finalList = new ArrayList<ArrayList<Integer>>();
		Map<Integer, Pair> hashMap = new HashMap<Integer, Pair>();
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
					hashMap.put(inputArray[i] + inputArray[j], new Pair(inputArray[i], inputArray[j]));
			}
		}

		Set<Entry<Integer, Pair>> entrySets = hashMap.entrySet();

		for (Entry<Integer, Pair> entry : entrySets) {
			if (hashMap.containsKey(sum - entry.getKey())) {
				if ((entry.getValue().i != hashMap.get(sum - entry.getKey()).i)
						&& (entry.getValue().i != hashMap.get(sum - entry.getKey()).j)
						&& (entry.getValue().j != hashMap.get(sum - entry.getKey()).j)
						&& (entry.getValue().j != hashMap.get(sum - entry.getKey()).i)) {
					ArrayList<Integer> al = new ArrayList<Integer>();
					al.add(entry.getValue().i);
					al.add(entry.getValue().j);
					al.add(hashMap.get(sum - entry.getKey()).i);
					al.add(hashMap.get(sum - entry.getKey()).j);
					finalList.add(al);
				}

			}
		}

		return finalList;
	}

	public static void main(String[] args) {
		ArraySum4On2 obj = new ArraySum4On2();
		int arr[] = new int[] { 10, 2, 3, 4, 5, 9, 7, 8 };
		System.out.println((obj.fourSum(arr, 23)).toString());
	}

}
