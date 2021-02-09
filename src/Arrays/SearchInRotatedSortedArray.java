package Arrays;

public class SearchInRotatedSortedArray {

	public int search(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		SearchInRotatedSortedArray srsaObj = new SearchInRotatedSortedArray();
		int[] nums = { 1 };
		int target = 0;
		System.out.println(srsaObj.search(nums, target));
	}

}
