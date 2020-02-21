package com.corejava.linkedlist;

public class LinkedListFindNthNode {
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

	public String findNode(int position) {
		int i = 1;
		Node node = head;

		while (i != position) {
			i++;
			node = node.next;
		}
		return "The node at index " + position + " from start of list is : " + node.data;
	}

	public String findNodeFromEnd(int position) {
		int i = 1;
		int pos = (count - position) + 1;
		Node node = head;

		while (i != pos) {
			i++;
			node = node.next;
		}

		return "The node at index " + position + " from end of list is : " + node.data;
	}

	public static void main(String[] args) {
		LinkedListFindNthNode linkedList = new LinkedListFindNthNode();
		linkedList.push(70);
		linkedList.push(10);
		linkedList.push(50);
		linkedList.push(20);
		linkedList.push(80);
		linkedList.printList();
		System.out.println("\n" + linkedList.findNode(3));
		System.out.println("\n" + linkedList.findNodeFromEnd(4));
	}
}
