package Arrays;

public class ArraysMedian {

	public double findMedianSortedArrays(double[] nums1, double[] nums2) {
		double median = 0;
		int i = 0, j = 0, k = 0;
		int left = nums1.length;
		int right = nums2.length;
		double[] finalArray = new double[left + right];

		while (i < left && j < right) {
			if (nums1[i] < nums2[j]) {
				finalArray[k] = nums1[i];
				k++;
				i++;
			} else if (nums2[j] < nums1[i]) {
				finalArray[k] = nums2[j];
				k++;
				j++;
			} else {
				finalArray[k] = nums1[i];
				k++;
				i++;
				j++;
			}
		}

		if (i < left) {
			for (int p = i; p < left; p++) {
				finalArray[k] = nums1[i];
				k++;
				i++;
			}
		}

		if (j < right) {
			for (int p = j; p < right; p++) {
				finalArray[k] = nums2[j];
				k++;
				j++;
			}
		}

		double firstElement = finalArray[0];
		double lastElement = finalArray[finalArray.length - 1];

		System.out.println(firstElement + ", " + lastElement);

		median = (firstElement + lastElement) / 2;

		return median;
	}

	public static void main(String[] args) {
		ArraysMedian amObj = new ArraysMedian();
		double[] nums1 = { 2 };
		double[] nums2 = {  };
		double medianValue = amObj.findMedianSortedArrays(nums1, nums2);
		System.out.println("The median value is : " + medianValue);
	}

}
