package Arrays;

public class ArrayRemoveElement {
	public int removeElement(int[] nums, int val) {
		
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
