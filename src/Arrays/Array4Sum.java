package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Array4Sum {

	public List<List<Integer>> fourSum(int[] nums) {

		List<List<Integer>> fal = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					for (int l = k + 1; l < nums.length; l++) {
						if (nums[i] + nums[j] + nums[k] + nums[l] == 0) {
							List<Integer> al = new ArrayList<Integer>();
							al.add(nums[i]);
							al.add(nums[j]);
							al.add(nums[k]);
							al.add(nums[l]);
							fal.add(al);
						}
					}
				}
			}
		}
		return fal;
	}

	public static void main(String[] args) {
		Array4Sum s = new Array4Sum();
		int arr[] = new int[] { 1, 0, -1, 0, -2, 2 };
		System.out.println(s.fourSum(arr));
	}

}
