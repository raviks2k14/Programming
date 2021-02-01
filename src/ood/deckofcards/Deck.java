package ood.deckofcards;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	List<Cards> deckOfCards = null;

	public void addCards() {
		deckOfCards = new ArrayList<Cards>();

		for (Suit s : Suit.values()) {
			for (int i = 1; i <= 13; i++) {
				deckOfCards.add(new Cards(i, s));
			}
		}
		
		System.out.println(deckOfCards.toString());
	}
	
	public static void main(String[] args) {
		new Deck().addCards();
	}
}
