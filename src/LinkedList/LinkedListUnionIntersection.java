package LinkedList;

public class LinkedListUnionIntersection {
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

	public void intersectionList(Node head1, Node head2) {
		Node n = head1;
		while (n != null) {
			if (isDataPresent(head2, n.data)) {
				push(n.data);
			}
			n = n.next;
		}
	}

	public boolean isDataPresent(Node head, int data) {
		Node n = head;
		while (n != null) {
			if (n.data == data) {
				return true;
			}
			n = n.next;
		}
		return false;
	}

	public void insertDataFromList(Node head) {
		Node n = head;
		while (n != null) {
			push(n.data);
			n = n.next;
		}
	}

	public void unionList(Node head2) {
		Node n = head2;
		while (n != null) {
			if (!isDataPresent(head, n.data)) {
				push(n.data);
			}
			n = n.next;
		}
	}

	public static void main(String[] args) {
		LinkedListUnionIntersection linkedList1 = new LinkedListUnionIntersection();
		LinkedListUnionIntersection linkedList2 = new LinkedListUnionIntersection();
		LinkedListUnionIntersection linkedList3 = new LinkedListUnionIntersection();
		linkedList1.push(5);
		linkedList1.push(4);
		linkedList1.push(3);
		linkedList1.push(2);
		linkedList1.push(1);

		linkedList2.push(6);
		linkedList2.push(7);
		linkedList2.push(9);
		linkedList2.push(2);
		linkedList2.push(1);

		linkedList1.printList();

		System.out.println("\n");

		linkedList2.printList();

		System.out.print("\nIntersection List :");

		linkedList3.intersectionList(linkedList1.head, linkedList2.head);

		System.out.println("\n");

		linkedList3.printList();

		linkedList3.head = null;

		linkedList3.insertDataFromList(linkedList1.head);

		System.out.print("\nUnion List :");

		linkedList3.unionList(linkedList2.head);

		System.out.println("\n");

		linkedList3.printList();
	}
}
