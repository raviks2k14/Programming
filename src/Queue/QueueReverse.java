package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse {
	static Queue<Integer> queue;

	public void reverseQueue() {
		Stack<Integer> stck = new Stack<Integer>();
		while (!queue.isEmpty()) {
			stck.push(queue.poll());
		}

		while (!stck.isEmpty()) {
			queue.add(stck.pop());
		}
	}

	public static void main(String[] args) {
		QueueReverse classObj = new QueueReverse();
		queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println("Queue Before Reverse :" + queue);
		classObj.reverseQueue();
		System.out.println("Queue After Reverse :" + queue);
	}
}
