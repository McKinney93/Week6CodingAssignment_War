package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	//field
	private List<Card> cards = new ArrayList<Card>();
	
	//c for card name, v for card value
	public Deck() {
		for (int c = 0; c <= 3; c++) {
			for (int v = 2; v <= 14; v++) {
				cards.add(new Card (c, v));
			}
		}
	}
	//get card
	public List<Card> getCards() {
		return cards;
	}
	
	//set card
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	//draw card
	public Card draw() {
		if (cards.isEmpty()) {
			return null;
		} else {
			Card topCard = cards.get(0);
			cards.remove(0);
			return topCard;
		}
	}
	//shuffle cards
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
}

	

	
	
	

