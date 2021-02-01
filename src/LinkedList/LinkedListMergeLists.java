package LinkedList;

public class LinkedListMergeLists {

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

	public void mergeLists(LinkedListMergeLists linkedList1, LinkedListMergeLists linkedList2,
			LinkedListMergeLists linkedList3) {

		Node n = linkedList3.head;
		Node temp = n;
		Node nodeList1 = linkedList1.head;
		Node nodeList2 = linkedList2.head;

		// Keep appending the smallest of nodeList1 && nodeList2 until both the lists
		// are not null.
		// Move the pointer to next node only if the smallest is found.
		while (nodeList1 != null && nodeList2 != null) {
			if (nodeList1.data < nodeList2.data) {
				n.next = nodeList1;
				nodeList1 = nodeList1.next;
			} else if (nodeList2.data < nodeList1.data) {
				n.next = nodeList2;
				nodeList2 = nodeList2.next;
			}
			n = n.next;
		}

		if (nodeList1 == null) {
			n.next = nodeList2;
		}

		if (nodeList2 == null) {
			n.next = nodeList1;
		}

		// Remove the dummy node
		linkedList3.head = temp.next;
	}

	public static void main(String[] args) {
		LinkedListMergeLists linkedList1 = new LinkedListMergeLists();
		LinkedListMergeLists linkedList2 = new LinkedListMergeLists();
		LinkedListMergeLists linkedList3 = new LinkedListMergeLists();

		// List 1 : sorted in ascending
		linkedList1.push(97);
		linkedList1.push(56);
		linkedList1.push(18);

		// List 2 : sorted in ascending
		linkedList2.push(63);
		linkedList2.push(45);
		linkedList2.push(23);

		// Create a dummy node
		linkedList3.push(0);

		linkedList1.printList();
		System.out.println("\n");
		linkedList2.printList();
		System.out.println("\n");
		linkedList3.mergeLists(linkedList1, linkedList2, linkedList3);
		linkedList3.printList();
	}

}
