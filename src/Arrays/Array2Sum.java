package Arrays;

import java.util.Arrays;

public class Array2Sum {

	public int[] twoSum(int[] nums, int target) {
        
        for(int i=0 ;i<nums.length;i++) {
        	for(int j=i+1 ;j<nums.length;j++) {
            	if(nums[i]+nums[j]==target) {
            		return new int[] { i, j };
            	}
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args){
    	Array2Sum s = new Array2Sum();
        int arr[] = new int[] {2, 7, 11, 15, 8, 1};
        System.out.println(Arrays.toString(s.twoSum(arr, 9)));
    }

}
