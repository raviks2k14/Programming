package LinkedList;

public class LinkedListAppendNodes {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void printNodes() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public void addNodeBeforeHead(Node next_node) {
		next_node.next = head;
		head = next_node;
		System.out.print("\n");
		printNodes();
	}

	public void addNodeAfterANode(Node previous_node, Node next_node) {
		next_node.next = previous_node.next;
		previous_node.next = next_node;
		System.out.print("\n");
		printNodes();
	}

	public void addNodeAtEnd(Node next_node) {
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = next_node;
		next_node.next = null;
		System.out.print("\n");
		printNodes();
	}

	public static void main(String[] args) {
		LinkedListAppendNodes linkedList = new LinkedListAppendNodes();
		linkedList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		linkedList.head.next = second;
		second.next = third;

		linkedList.printNodes();

		Node next_node = new Node(4);

		linkedList.addNodeBeforeHead(next_node); // Add node before head

		Node next_node1 = new Node(5);

		linkedList.addNodeAfterANode(second, next_node1); // Add node after a given node

		Node next_node2 = new Node(6);

		linkedList.addNodeAtEnd(next_node2); // Add node at the end

		Node next_node3 = new Node(7);

		linkedList.addNodeAtEnd(next_node3); // Add another node at the end
	}

}
