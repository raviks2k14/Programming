package com.corejava.linkedlist;

public class LinkedListReverse {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int c) {
		Node node = new Node(c);
		node.next = head;
		head = node;
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public void reverseList() {
		Node n = head, prev = null, current = null;
		while (n != null) {
			current = n;
			n = n.next;
			current.next = prev;
			prev = current;
			head = current;
		}
	}

	public static void main(String[] args) {
		LinkedListReverse linkedList = new LinkedListReverse();

		linkedList.push(5);
		linkedList.push(4);
		linkedList.push(3);
		linkedList.push(2);
		linkedList.push(1);

		linkedList.printList();

		linkedList.reverseList();

		System.out.println("\n");

		linkedList.printList();

	}
}
