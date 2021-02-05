package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {

		int[] finalArray = new int[nums.length];
		List<Integer> al = new ArrayList<Integer>();

		for (int j = 0; j < nums.length; j++) {
			al.add(nums[j]);
		}

		for (int i = 0; i < al.size(); i++) {
			int product = 1;
			for (int p = 0; p < nums.length; p++) {
				if (nums[p] != al.get(i)) {
					product *= nums[p];
				}
			}
			finalArray[i] = product;
		}

		return finalArray;
	}

	public static void main(String[] args) {
		ProductOfArrayExceptSelf poats = new ProductOfArrayExceptSelf();
		int[] arr = new int[] { 4, 5, 1, 8, 2 };
		System.out.println(Arrays.toString(poats.productExceptSelf(arr)));
	}

}
