package com.corejava.queue;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueEnQDQDogsCats {

	static Queue<Dog> dogQ;
	static Queue<Cat> catQ;

	QueueEnQDQDogsCats() {
		dogQ = new LinkedList<>();
		catQ = new LinkedList<>();
	}

	public void enQueue(Animal animal) {

		if (!(animal instanceof Dog) && !(animal instanceof Cat)) {
			System.out.println("Animal is not a Dog or Cat");
		} else if (animal instanceof Dog) {
			animal.dateArrived = new Date();
			dogQ.offer((Dog) animal);
		} else {
			animal.dateArrived = new Date();
			catQ.offer((Cat) animal);
		}
	}

	public void deQueue(String type) throws Exception {
		String animalType = type;
		if (animalType.equalsIgnoreCase("Cat")) {
			if (catQ.isEmpty()) {
				throw new Exception("There are no more Cats!!!");
			} else {
				catQ.poll();
			}
		} else if (animalType.equalsIgnoreCase("Dog")) {
			if (dogQ.isEmpty()) {
				throw new Exception("There are no more Dogs!!!");
			} else {
				dogQ.poll();
			}
		}
	}

	public void deQueueAny() throws Exception {

		if (dogQ.isEmpty() && catQ.isEmpty()) {
			throw new Exception("There are no more Dogs & Cats");
		}
		if (dogQ.isEmpty()) {
			catQ.poll();
		} else if (catQ.isEmpty()) {
			dogQ.poll();
		} else {
			Animal animal = catQ.peek().dateArrived.compareTo((dogQ.peek().dateArrived)) < 0 ? catQ.poll()
					: dogQ.poll();
		}
	}

	public static void main(String[] args) throws Exception {
		QueueEnQDQDogsCats classObj = new QueueEnQDQDogsCats();
		List<Animal> animals = Arrays.asList(new Dog(), new Cat(), new Dog(), new Cat(), new Dog(), new Cat(),
				new Dog(), new Cat(), new Dog(), new Cat(), new Dog());

		for (Animal animal : animals) {
			classObj.enQueue(animal);
			Thread.sleep(2000);
		}
		classObj.deQueueAny();
		classObj.deQueue("Cat");
		classObj.deQueue("Dog");
		classObj.deQueueAny();
		classObj.deQueueAny();
		System.out.println("Dog Queue :" + dogQ.size());
		System.out.println("Cat Queue :" + catQ.size());
	}

}

class Animal {
	String type;
	Date dateArrived;
}

class Dog extends Animal {

	Dog() {
		super();
		type = "dog";
	}

}

class Cat extends Animal {

	Cat() {
		super();
		type = "cat";
	}

}
