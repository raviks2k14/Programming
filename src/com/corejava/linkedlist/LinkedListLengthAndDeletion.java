package com.corejava.linkedlist;

public class LinkedListLengthAndDeletion {
	Node head;
	static int size = 1;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int d) {
		Node node = new Node(d);
		node.next = head;
		head = node;
		size++;
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public void deleteList() {
		head = null;
	}

	public void lengthLinkedList() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println("\nThe number of nodes in the list is : " + count);
	}

	public void deleteHead() {
		Node temp = head;
		head = temp.next;
	}

	public void deleteLastNode() {
		Node pointer = head;
		int i = 1;
		int k = size - 1;
		while (i != k) {
			pointer = pointer.next;
			i++;
		}
		pointer.next = null;
	}

	public static void main(String[] args) {
		LinkedListLengthAndDeletion linkedList = new LinkedListLengthAndDeletion();
		linkedList.push(7);
		linkedList.push(1);
		linkedList.push(3);
		linkedList.push(2);
		linkedList.push(8);
		linkedList.printList();
		linkedList.lengthLinkedList(); // This method determines the length of linkedList
		linkedList.deleteLastNode();
		System.out.println("\n");
		linkedList.printList();
//		linkedList.deleteHead();
//		linkedList.printList();
		// linkedList.deleteList(); // This method deletes the linked list (Make the
		// head null)

	}
}
