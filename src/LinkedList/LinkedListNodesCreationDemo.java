package LinkedList;

public class LinkedListNodesCreationDemo {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int d) {
			data = d;
			next = null;
		} // Constructor
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		LinkedListNodesCreationDemo linkedList = new LinkedListNodesCreationDemo();
		linkedList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		linkedList.head.next = second;
		second.next = third;

		linkedList.printList();
	}

}
