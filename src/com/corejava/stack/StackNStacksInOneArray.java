package com.corejava.stack;

public class StackNStacksInOneArray {

	int stackData[];
	int topOfStack[];
	int nextIndex[];

	int arraySize, noOfStacks;
	int nextAvailable;

	public StackNStacksInOneArray(int stacksCount, int arrSize) {

		noOfStacks = stacksCount;
		arraySize = arrSize;
		stackData = new int[arraySize];
		topOfStack = new int[noOfStacks];
		nextIndex = new int[arraySize];

		for (int i = 0; i < noOfStacks; i++)
			topOfStack[i] = -1;

		nextAvailable = 0;
		for (int i = 0; i < arraySize - 1; i++)
			nextIndex[i] = i + 1;
		nextIndex[arraySize - 1] = -1;

	}

	void push(int data, int stack) {

		if (stack < 0 || stack > topOfStack.length) {
			throw new IndexOutOfBoundsException();
		}

		int currentIndex = nextAvailable;
		nextAvailable = nextIndex[currentIndex];
		stackData[currentIndex] = data;
		nextIndex[currentIndex] = topOfStack[stack];
		topOfStack[stack] = currentIndex;
	}

	int pop(int stack) {

		if (stack < 0 || stack > topOfStack.length || topOfStack[stack] < 0) {
			throw new IndexOutOfBoundsException();
		}

		int currentIndex = topOfStack[stack];
		int value = stackData[currentIndex];
		topOfStack[stack] = nextIndex[currentIndex];
		nextIndex[currentIndex] = nextAvailable;
		nextAvailable = currentIndex;

		return value;
	}

	public static void main(String[] args) {

		int noOfStacks = 3, arraySize = 10;

		StackNStacksInOneArray ks = new StackNStacksInOneArray(noOfStacks, arraySize);

		ks.push(15, 2);
		ks.push(45, 2);

		ks.push(17, 1);
		ks.push(49, 1);
		ks.push(39, 1);

		ks.push(11, 0);
		ks.push(9, 0);
		ks.push(7, 0);

		System.out.println("Popped element from stack 2 is " + ks.pop(2));
		System.out.println("Popped element from stack 1 is " + ks.pop(1));
		System.out.println("Popped element from stack 0 is " + ks.pop(0));
	}

}
