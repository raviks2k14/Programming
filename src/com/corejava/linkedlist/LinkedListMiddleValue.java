package com.corejava.linkedlist;

public class LinkedListMiddleValue {
	Node head;
	static int count = 0;

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
		count++;
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public String findMiddleNode() {
		int remainder = count % 2;
		int middleNode = (count + 1) / 2;
		int i = 0;
		if (head != null) {
			i = 1;
		} else {
			return "The head in the linked list is null";
		}

		Node node = head;

		while (node != null) {
			if (i == middleNode) {

				if (remainder == 0) {
					return "The middle value is " + node.next.data;
				} else {
					return "The middle value is " + node.data;
				}

			} else {
				i++;
				node = node.next;
			}
		}
		return "The middle value could not be found";
	}

	public static void main(String[] args) {
		LinkedListMiddleValue linkedList = new LinkedListMiddleValue();
		linkedList.push(7);
		linkedList.push(1);
		linkedList.push(5);
		linkedList.push(2);
		linkedList.push(8);
		linkedList.push(9);
		//linkedList.push(11);
		linkedList.printList();
		System.out.println("\n" + linkedList.findMiddleNode());
	}
}
