package Queue;

import java.util.Stack;

public class QueueImplementationUsingTwoStacks {
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();

	public void enQueue(int number) {
		System.out.println("En-queueing ++ : " + stack1.push(number));
	}

	public void deQueue() {

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		System.out.println("De-queueing -- : " + stack2.pop());
	}

	public static void main(String[] args) {
		QueueImplementationUsingTwoStacks queue = new QueueImplementationUsingTwoStacks();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
	}

}
