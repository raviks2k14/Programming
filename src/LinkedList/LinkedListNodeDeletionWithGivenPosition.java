package LinkedList;

import java.util.Scanner;

public class LinkedListNodeDeletionWithGivenPosition {
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

	public void deleteNode(int position, int size) {

		if (position == 0) {
			System.out.println("\nThe postion can only start from 1");
			return;
		} else if (position > size) {
			System.out.println("\nThe postion exceeds the size of the linked list");
			return;
		}
		int i = 1;
		Node node = head, prev = null;
		while (i != position) {
			prev = node;
			node = node.next;
			i++;
		}

		if (node != null && prev == null) {
			head = node.next;
		} else if (node != null && prev != null) {
			prev.next = node.next;
		} else {
			prev.next = null;
		}
		System.out.println("\n");
		printList();
	}

	public static void main(String[] args) {
		LinkedListNodeDeletionWithGivenPosition linkedList = new LinkedListNodeDeletionWithGivenPosition();
		linkedList.push(7);
		linkedList.push(1);
		linkedList.push(3);
		linkedList.push(2);
		linkedList.push(8);
		linkedList.printList();
		int pos = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter the position of node to be deleted...");
		try {
			if (scanner.hasNextInt()) {
				pos = scanner.nextInt();
			} else {
				System.out.println("Entered value is incorrect");
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		linkedList.deleteNode(pos, size);
	}
}
