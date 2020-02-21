package com.corejava.linkedlist;

public class LinkedListSwapNodes {

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

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public void swapNodes(int x, int y) {
		Node n = head;

		while (n != null) {
			if (n.data == x) {
				n.data = y;
			} else if (n.data == y) {
				n.data = x;
			}
			n = n.next;
		}
	}

	public void swapNodesWithoutData(int x, int y) {
		Node n = head, prev = null;
		Node tempxprev = null;
		Node tempxnext = null;
		Node tempyprev = null;
		Node tempynext = null;
		Node tempXFinal = null;
		Node tempYFinal = null;
		boolean xFlag = false;
		boolean yFlag = false;
		while (n != null) {
			
			if (n.data == x) {
				tempxprev = prev.next;
				xFlag = true;
				tempxnext = n.next;
				// n.data = y;
			} else if (n.data == y) {
				tempyprev = prev.next;
				yFlag = true;
				tempynext = n.next;
				// n.data = x;
			}
			
			System.out.println(xFlag);
			System.out.println(yFlag);

			if (xFlag && yFlag) {
				
				System.out.println("Both X & Y values found");
				System.out.println("tempxprev : "+tempxprev);
				System.out.println("tempxnext : "+tempxnext);
				System.out.println("tempyprev : "+tempyprev);
				System.out.println("tempynext : "+tempynext);
				
				tempXFinal = tempxprev;
				tempxprev = tempyprev;
				tempyprev = tempXFinal;
				
				tempYFinal = tempxnext;
				tempxnext = tempynext;
				tempynext = tempYFinal;
				
				System.out.println("\n");
				System.out.println("tempxprev : "+tempxprev);
				System.out.println("tempxnext : "+tempxnext);
				System.out.println("tempyprev : "+tempyprev);
				System.out.println("tempynext : "+tempynext);
				
				xFlag = false;
				yFlag = false;
			}
			prev = n;
			n = n.next;
		}
	}

	public static void main(String[] args) {
		LinkedListSwapNodes linkedList = new LinkedListSwapNodes();

		linkedList.push(14);
		linkedList.push(20);
		linkedList.push(13);
		linkedList.push(12);
		linkedList.push(15);
		linkedList.push(10);

		linkedList.printList();
		System.out.println("\n");
		//linkedList.swapNodes(12, 20);
		//linkedList.printList();
		linkedList.swapNodesWithoutData(15, 13);
		System.out.println("\n");
		linkedList.printList();
	}

}
