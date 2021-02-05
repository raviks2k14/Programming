package Recursion;

public class MagicIndex {

	private int search(int[] arr, int low, int high) {
		if (high >= low) {
			/* low + (high - low)/2; */
			int mid = (low + high) / 2;
			if (mid == arr[mid])
				return mid;
			if (arr[mid] > mid)
				return search(arr, low, (mid - 1));
			else
				return search(arr, (mid + 1), high);
		}

		/*
		 * Return -1 if there is no Fixed Point
		 */
		return -1;
	}

	public static void main(String[] args) {
		int[] A = { -1, 0, 1, 4, 4, 10 };
		MagicIndex m = new MagicIndex();
		System.out.println("Magic index " + m.search(A, 0, A.length - 1));
	}

}
