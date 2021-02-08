package Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {

		int[] finalArray = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			int product = 1;
			for (int p = 0; p < nums.length; p++) {
				if (p != i) {
					product *= nums[p];
				}
			}
			finalArray[i] = product;
		}

		return finalArray;
	}

	public static void main(String[] args) {
		ProductOfArrayExceptSelf poats = new ProductOfArrayExceptSelf();
		int[] arr = new int[] {1, 2, 3, 4 };
		System.out.println(Arrays.toString(poats.productExceptSelf(arr)));
	}

}
