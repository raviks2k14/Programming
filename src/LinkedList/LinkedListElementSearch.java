package LinkedList;

public class LinkedListElementSearch {

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

	// Iterative
	public boolean searchList(int element) {
		Node node = head;
		while (node != null) {
			if (node.data == element) {
				return true;
			} else {
				node = node.next;
			}
		}
		return false;
	}

	// Recursive
	public boolean searchList(Node node, int element) {
		if (node == null)
			return false;
		if (node.data == element)
			return true;
		return searchList(node.next, element);
	}

	public static void main(String[] args) {
		LinkedListElementSearch linkedList = new LinkedListElementSearch();
		linkedList.push(7);
		linkedList.push(1);
		linkedList.push(3);
		linkedList.push(2);
		linkedList.push(8);
		linkedList.printList();
		System.out.println(linkedList.searchList(3));
		System.out.println(linkedList.searchList(linkedList.head, 3));
	}

}
