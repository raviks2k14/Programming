package com.corejava.linkedlist;

public class LinkedListSortedInsertNode {
	Node head;

	static class Node {
		int data = 0;
		Node next;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int number) {
		Node node = new Node(number);
		node.next = head;
		head = node;
	}

	public void printList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public void insertNode(int number) {
		Node newNode = new Node(number);
		Node n = head.next, prev = head;
		while (n != null) {
			if (newNode.data < n.data) {
				prev.next = newNode;
				newNode.next = n;
				break;
			}
			prev = n;
			n = n.next;
		}
	}

	public static void main(String args[]) {
		LinkedListSortedInsertNode linkedList = new LinkedListSortedInsertNode();
		linkedList.push(6);
		linkedList.push(5);
		linkedList.push(3);
		linkedList.push(2);
		linkedList.push(1);
		linkedList.printList();
		linkedList.insertNode(4);
		System.out.println("\n");
		linkedList.printList();
	}
}
