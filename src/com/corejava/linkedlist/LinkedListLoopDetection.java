package com.corejava.linkedlist;

import java.util.HashSet;

public class LinkedListLoopDetection {
	Node head;

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
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public Node isLinkedListALoop() {
		HashSet<Node> s = new HashSet<Node>();
		Node node = head;
		while (node != null) {
			if (s.contains(node)) {
				return node;
			}
			s.add(node);
			node = node.next;
		}
		return null;
	}

	public int getLengthOfLoop(Node node) {
		int length = 1;
		Node temp = node;
		node = node.next;
		while (!(node.equals(temp))) {
			length++;
			node = node.next;
		}
		return length;
	}

	public static void main(String[] args) {
		LinkedListLoopDetection linkedList = new LinkedListLoopDetection();
		linkedList.push(20);
		linkedList.push(4);
		linkedList.push(15);
		linkedList.push(10);
		linkedList.push(18);
		linkedList.printList();
		linkedList.head.next.next.next.next.next = linkedList.head;
		Node node = linkedList.isLinkedListALoop();
		System.out.println("\n" + linkedList.getLengthOfLoop(node));
	}
}
