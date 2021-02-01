package Stack;

import java.util.Stack;

public class StackSortAscending {

	public static Stack<Integer> sortstack(Stack<Integer> srcStack) {
		Stack<Integer> destStack = new Stack<Integer>();
//		while (!srcStack.isEmpty()) {
//			int tmp = srcStack.pop();
//			while (!destStack.isEmpty() && destStack.peek() > tmp) {
//				srcStack.push(destStack.pop());
//			}
//			destStack.push(tmp);
//		}
//		return destStack;

		while (!srcStack.isEmpty()) {
			if (destStack.isEmpty()) {
				destStack.push(srcStack.pop());
			} else {
				int tmp = srcStack.pop();
				if (tmp > destStack.peek()) {
					srcStack.push(destStack.pop());
					srcStack.push(tmp);
				} else {
					destStack.push(tmp);
				}
			}
		}

		return destStack;

	}

	public static void main(String args[]) {
		Stack<Integer> srcStack = new Stack<Integer>();
		srcStack.add(34);
		srcStack.add(3);
		srcStack.add(31);
		srcStack.add(98);
		srcStack.add(92);
		srcStack.add(23);

		Stack<Integer> tmpStack = sortstack(srcStack);
		System.out.println("Sorted numbers are:");

		while (!tmpStack.empty()) {
			System.out.print(tmpStack.pop() + " ");
		}
	}
}
