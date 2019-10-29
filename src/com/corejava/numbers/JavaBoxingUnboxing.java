package com.corejava.numbers;

public class JavaBoxingUnboxing {

	public static void main(String[] args) {
		Integer x = 10; // Boxing : Converting a primitive to object
		x = x + 10; // UnBoxing : Converting from object to primitive
		System.out.println("The value of x : " + x);
	}
}
