package Tree;

public class SymmetricTree {

	public boolean isSymmetric(TreeNode rootNode) {
		if (rootNode == null) {
			return true;
		}
		return isSymmetricUtil(rootNode.left, rootNode.right);
	}

	public boolean isSymmetricUtil(TreeNode leftNode, TreeNode rightNode) {

		if (leftNode == null || rightNode == null) {
			return true;
		}

		if (leftNode.val != rightNode.val) {
			return false;
		}

		if (!isSymmetricUtil(leftNode.left, rightNode.right)) {
			return false;
		}

		if (!isSymmetricUtil(leftNode.right, rightNode.left)) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		TreeNode leftTree = new TreeNode(2, new TreeNode(4), new TreeNode(3));
		TreeNode rightTree = new TreeNode(2, new TreeNode(3), new TreeNode(4));
		TreeNode rootNode = new TreeNode(1, leftTree, rightTree);
		SymmetricTree symmetricObj = new SymmetricTree();
		System.out.println("Symmetric: " + symmetricObj.isSymmetric(rootNode));

	}

}
