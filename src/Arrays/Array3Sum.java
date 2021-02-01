package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Array3Sum {

	// Sum equal to 0 - returns the indices
	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> fal = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> al = new ArrayList<Integer>();
						al.add(i);
						al.add(j);
						al.add(k);
						fal.add(al);
					}
				}
			}
		}
		return fal;
	}

	public static void main(String[] args) {
		Array3Sum s = new Array3Sum();
		int arr[] = new int[] { -1, 0, 1, 2, -1, -4 };
		System.out.println(s.threeSum(arr));
	}

}
