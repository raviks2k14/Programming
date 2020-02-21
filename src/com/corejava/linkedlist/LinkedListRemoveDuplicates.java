package com.corejava.linkedlist;

import java.util.HashSet;

public class LinkedListRemoveDuplicates {

	Node head;
	int count = 0;

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
		count++;
	}

	public void printList(LinkedListRemoveDuplicates linkedList) {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public void removeDuplicatesFromSortedList() {
		Node n = head;
		while (n != null) {
			if (n.data == n.next.data) {
				n.next = n.next.next;
			}
			n = n.next;
		}
	}

	public void removeDuplicatesFromUnSortedList() {
		HashSet<Integer> s = new HashSet<>();
		Node n = head, prev = null;
		while (n != null) {
			int curval = n.data;
			if (s.contains(curval)) {
				prev.next = n.next;
			} else {
				s.add(curval);
				prev = n;
			}
			n = n.next;
		}
	}

	public static void main(String[] args) {
		LinkedListRemoveDuplicates linkedList = new LinkedListRemoveDuplicates();

		linkedList.push(5);
		linkedList.push(5);
		linkedList.push(4);
		linkedList.push(4);
		linkedList.push(3);
		linkedList.push(1);
		linkedList.push(1);

		linkedList.printList(linkedList);
		linkedList.removeDuplicatesFromSortedList();
		System.out.println("\n");
		linkedList.printList(linkedList);

		linkedList.push(5);
		linkedList.push(4);
		linkedList.push(5);
		linkedList.push(1);
		linkedList.push(3);
		linkedList.push(2);
		linkedList.push(1);

		System.out.println("\n");
		linkedList.printList(linkedList);
		linkedList.removeDuplicatesFromUnSortedList();
		System.out.println("\n");
		linkedList.printList(linkedList);

	}

}
