package com.corejava.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	Node root;
	Queue<Node> q;
	Node tempNode;

	LevelOrderTraversal() {
		q = new LinkedList<Node>();
		tempNode = new Node(100);
	}

	public void printLevelOrderTraversal() {
		enQueue(root);
		enQueue(tempNode);
		deQueue();
	}

	public void enQueue(Node n) {
		q.add(n);
	}

	public void deQueue() {
		while (!q.isEmpty()) {
			if ((root.left != null)) {
				enQueue(root.left);
			}
			if ((root.right != null)) {
				enQueue(root.right);
			}

			if (q.peek().data == 100) {
				System.out.println(); //Print with a new line
				q.poll();
				root = q.peek();
				if (q.peek() != null) {
					enQueue(tempNode);
				}
			} else {
				System.out.print("  "+root.data+"  "); //Print without a newline
				q.poll();
				root = q.peek();
			}

		}
	}

	public static void main(String args[]) {
		LevelOrderTraversal tree = new LevelOrderTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.right.right.left = new Node(10);
		tree.root.right.right.left.left = new Node(11);
		tree.root.right.right.left.right = new Node(12);
		tree.printLevelOrderTraversal();
	}
}
