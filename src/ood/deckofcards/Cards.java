package ood.deckofcards;

public class Cards {

	int faceValue;
	Suit suite;

	public Cards(int faceValue, Suit suite) {
		this.faceValue = faceValue;
		this.suite = suite;
	}

	public String toString() {

		return String.valueOf(this.faceValue)+":"+suite.name();

	}

}
