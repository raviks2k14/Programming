package LinkedList;

public class LinkedListCountInt {
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

	public String findCount(int number) {
		int count = 0;

		Node node = head;
		while (node != null) {
				if(node.data == number) {
					count++;
				}
					node = node.next;
		}
		return "The count is : "+count;
	}

	public static void main(String[] args) {
		LinkedListCountInt linkedList = new LinkedListCountInt();
		linkedList.push(7);
		linkedList.push(5);
		linkedList.push(3);
		linkedList.push(5);
		linkedList.push(3);
		linkedList.push(9);
		linkedList.printList();
		System.out.println("\n" + linkedList.findCount(5));
	}
}
