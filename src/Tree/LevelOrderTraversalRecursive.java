package Tree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversalRecursive {

	List<ArrayList<Integer>> traversalList = new ArrayList<ArrayList<Integer>>();

	public void levelOrderTraversalList(TreeNode rootNode) {
		levelOrderTraversalListUtil(rootNode);
	}

	public ArrayList<Integer> levelOrderTraversalListUtil(TreeNode rootNode) {
		ArrayList<Integer> individualList = new ArrayList<>();
		if (rootNode == null) {
			return individualList;
		}

		if (rootNode.left == null && rootNode.right == null) {
			individualList.add(rootNode.val);
			traversalList.add(individualList);
			return individualList;
		}

		if (rootNode.left == null || rootNode.right == null) {
			if (!(rootNode.left == null)) {
				individualList.add(rootNode.left.val);
			} else {
				individualList.add(rootNode.right.val);
			}
		}

		int leftVal = rootNode.left.val;
		int rightVal = rootNode.right.val;
		ArrayList<Integer> leftList = levelOrderTraversalListUtil(rootNode.left);
		ArrayList<Integer> rightList = levelOrderTraversalListUtil(rootNode.right);
		ArrayList<Integer> tempList = new ArrayList<>();
		tempList.add(leftVal);
		tempList.add(rightVal);
		traversalList.add(tempList);
		traversalList.add(leftList);
		traversalList.add(rightList);

		return individualList;
	}

	public static void main(String[] args) {
		TreeNode leftTree = new TreeNode(20, new TreeNode(7), new TreeNode(15));
		TreeNode rightTree = new TreeNode(9);
		TreeNode rootNode = new TreeNode(3, leftTree, rightTree);
		LevelOrderTraversalRecursive obj = new LevelOrderTraversalRecursive();
		obj.levelOrderTraversalList(rootNode);
		
		for(ArrayList<Integer> arrayList : obj.traversalList) {
			System.out.println(arrayList.toString());
			System.out.println();
		}
	}

}
