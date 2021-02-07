package Arrays;

public class JavaContinuousSubArrays {
	public int subarraySum(int[] nums, int k) {

		int count = 0;

		if (nums.length == 0) {
			return 0;
		}
		if (nums.length == 1 && nums[0] == k) {
			return 1;
		}

		for (int i = 0; i < nums.length; i++) {
			int sum = nums[i];
			if ((sum == k && i == 0) || (i == nums.length - 1 && sum == k)) {
				count++;
			}
			for (int j = i + 1; j < nums.length; j++) {
				sum = sum + nums[j];
				if (sum == k) {
					count++;
				}
				if (sum > k) {
					break;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		JavaContinuousSubArrays s = new JavaContinuousSubArrays();
		int num = 3;
		System.out.println("Found "+s.subarraySum(new int[] { 1, 2, 3 }, num)+" continuous sub array "
				+ "which has the sum equalling to "+num);
	}
}
