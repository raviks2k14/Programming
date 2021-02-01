package LinkedList;

public class LinkedAddTwoNumbers {
	Node head;
	public static int[] sumData = new int[] { 0, 0 };

	static class Node {
		Node next;
		int data;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}

	public void printList(Node n) {
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public static void sumData(int sum) {
		String str = Integer.toString(sum);
		for (int i = str.length() - 1; i >= 0; i--) {
			sumData[i] = (int) Integer.parseInt(((Character) str.charAt(i)).toString());
		}
	}

	public static void addLinkedList(Node n1, Node n2, LinkedAddTwoNumbers linkedList3) {

		while (n1 != null && n2 != null) {
			int result = n1.data + n2.data;
			if (Integer.toString(result).length() > 1) {
				sumData(result);
				linkedList3.push(sumData[1]);
			} else {
				if (sumData != null && sumData[0] != 0) {
					linkedList3.push(result + sumData[0]);
				} else {
					linkedList3.push(result);
				}
			}
			n1 = n1.next;
			n2 = n2.next;
		}

	}

	public void reverseList() {
		Node n = head, prev = null, current = null;

		while (n != null) {
			current = n;
			n = n.next;
			current.next = prev;
			prev = current;
			head = current;
		}
	}

	public static void main(String[] args) {
		LinkedAddTwoNumbers linkedList1 = new LinkedAddTwoNumbers();
		linkedList1.push(3);
		linkedList1.push(4);
		linkedList1.push(2);

		linkedList1.printList(linkedList1.head);

		LinkedAddTwoNumbers linkedList2 = new LinkedAddTwoNumbers();
		linkedList2.push(4);
		linkedList2.push(6);
		linkedList2.push(5);

		System.out.println("\n");

		linkedList1.printList(linkedList2.head);

		LinkedAddTwoNumbers linkedList3 = new LinkedAddTwoNumbers();

		addLinkedList(linkedList1.head, linkedList2.head, linkedList3);

		System.out.println("\n");

		linkedList3.printList(linkedList3.head);

		linkedList3.reverseList();

		System.out.println("\n");

		linkedList3.printList(linkedList3.head);

	}

}
