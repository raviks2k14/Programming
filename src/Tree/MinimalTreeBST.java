package Tree;

//Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class MinimalTreeBST {

	public TreeNode sortedArrayToBST(int[] nums) {
		return createMinimalBST(nums, 0, nums.length - 1);
	}

	TreeNode createMinimalBST(int arr[], int start, int end) {
		if (end < start)
			return null;
		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(arr[mid]);
		n.left = createMinimalBST(arr, start, mid - 1);
		n.right = createMinimalBST(arr, mid + 1, end);
		return n;
	}

	public void displayTree(TreeNode root) {
		if (root != null) {
			displayTree(root.left);
			System.out.print(" " + root.val);
			displayTree(root.right);
		}
	}

	public static void main(String[] args) {
		MinimalTreeBST mBSTObj = new MinimalTreeBST();
		int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		TreeNode minimalNode = mBSTObj.sortedArrayToBST(sortedArray);
		mBSTObj.displayTree(minimalNode);

	}
}
