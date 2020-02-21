package com.corejava.linkedlist;

public class LinkedListPalindrome {
	Node head;
	int count = 0;

	static class Node {
		String data;
		Node next;

		Node(String d) {
			data = d;
			next = null;
		}
	}

	public void push(String c) {
		Node node = new Node(c);
		node.next = head;
		head = node;
		count++;
	}

	public void printList(LinkedListPalindrome linkedList) {
		Node n = linkedList.head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public String populateNewList(LinkedListPalindrome originalLinkedList, LinkedListPalindrome newLinkedList) {
		int remainder = count % 2;
		int middleNode = (count + 1) / 2;
		int i = 0;
		if (originalLinkedList.head != null) {
			i = 1;
		} else {
			return "The head in the linked list is null";
		}

		Node node = originalLinkedList.head;

		while (node != null) {
			if (i == middleNode) {

				if (remainder == 0) {
					if (node.next != null) {
						newLinkedList.push(node.next.data);
					}
					// return "The middle value is " + node.next.data;
					node = node.next;
				} else {
					newLinkedList.push(node.data);
					// return "The middle value is " + node.data;
					node = node.next;
				}

			} else {
				i++;
				node = node.next;
			}
		}
		return "The middle value could not be found";
	}

	public String compareLinkedLists(LinkedListPalindrome originalList, LinkedListPalindrome newLinkedList) {
		int middleNode = (originalList.count + 1) / 2;

		Node nodeOriginial = originalList.head;
		Node nodeNewList = newLinkedList.head;

		for (int i = 1; i <= middleNode; i++) {
			if (nodeOriginial.data.equalsIgnoreCase(nodeNewList.data)) {
				nodeOriginial = nodeOriginial.next;
				nodeNewList = nodeNewList.next;
			} else {
				return "The LinkedList is not a palindrome";
			}
		}
		return "The LinkedList is a palindrome";
	}

	public static void main(String[] args) {
		LinkedListPalindrome linkedList = new LinkedListPalindrome();
		LinkedListPalindrome newLinkedList = new LinkedListPalindrome();

		// ODD List
//		linkedList.push("M");
//		linkedList.push("A");
//		linkedList.push("L");
//		linkedList.push("A");
//		linkedList.push("Y");
//		linkedList.push("A");
//		linkedList.push("L");
//		linkedList.push("A");
//		linkedList.push("M");

		// Even List
		linkedList.push("A");
		linkedList.push("V");
		linkedList.push("V");
		linkedList.push("A");

		linkedList.printList(linkedList);
		System.out.println("\n");
		linkedList.populateNewList(linkedList, newLinkedList);
		System.out.println(linkedList.compareLinkedLists(linkedList, newLinkedList));

	}
}
