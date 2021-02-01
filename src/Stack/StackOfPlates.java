package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class StackOfPlates {
	ArrayList<Stack<Integer>> listOfStacks = null;
	int capacityOfEachStack;
	int stackTop;

	StackOfPlates(int capacity) {
		listOfStacks = new ArrayList<Stack<Integer>>();
		capacityOfEachStack = capacity;
		stackTop = 0;
	}

	public void push(int number) {
		Stack<Integer> latestStack = getLatestStack();
		latestStack.push(number);
		System.out.println("Stacks :" + listOfStacks.toString());
	}

	public void pop() {
		Stack<Integer> latestStack = getLatestStack();
		if (latestStack.isEmpty()) {
			listOfStacks.remove(stackTop);
			stackTop = stackTop - 1;
			latestStack = listOfStacks.get(stackTop);
			latestStack.pop();
		} else {
			latestStack.pop();
		}
		System.out.println("Stacks :" + listOfStacks.toString());
	}

	public Stack<Integer> getLatestStack() {
		Stack<Integer> newStack = null;
		if (listOfStacks.size() == 0) {
			newStack = new Stack<Integer>();
			listOfStacks.add(newStack);
			stackTop = 0;
		} else {
			for (int i = 0; i < listOfStacks.size(); i++) {
				if (listOfStacks.get(i).isEmpty() || listOfStacks.get(i).size() < capacityOfEachStack) {
					stackTop = i;
					return listOfStacks.get(stackTop);
				}
			}
			newStack = new Stack<Integer>();
			listOfStacks.add(newStack);
			stackTop = stackTop + 1;
		}
		return listOfStacks.get(stackTop);
	}

	public static void main(String[] args) {
		StackOfPlates stackOfPlates = new StackOfPlates(3);
		stackOfPlates.push(1);
		stackOfPlates.push(2);
		stackOfPlates.push(3);
		stackOfPlates.push(4);
		stackOfPlates.push(5);
		stackOfPlates.push(6);
		stackOfPlates.push(7);
		stackOfPlates.push(8);
		stackOfPlates.push(9);
		stackOfPlates.push(10);
		stackOfPlates.push(11);
		stackOfPlates.pop();
		stackOfPlates.pop();
		stackOfPlates.pop();
		stackOfPlates.push(89);
		stackOfPlates.push(90);
		stackOfPlates.push(91);
	}

}
