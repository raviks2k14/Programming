package com.corejava.miscellaneous;

public class ArrayRemoveElement {
	public int removeElement(int[] nums, int val) {
//		if (nums.length == 0) {
//			return 0;
//		}
//		int index = 0;
//		int count = 0;
//		while (index < nums.length) {
//			System.out.println(nums[index]);
//			if (nums[index] != val) {
//				index++;
//			} else {
//				nums[index] = nums[index + 1];
//				count++;
//			}
//		}
//		return count;
		
		int i = 0;
	    int n = nums.length;
	    while (i < n) {
	        if (nums[i] == val) {
	            nums[i] = nums[n - 1];
	            // reduce array size by one
	            n--;
	        } else {
	            i++;
	        }
	    }
	    return n;
	}

	public static void main(String[] args) {
		ArrayRemoveElement obj = new ArrayRemoveElement();
		System.out.println(obj.removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
	}

}
