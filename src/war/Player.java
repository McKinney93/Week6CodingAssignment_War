package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> playerHand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name) {
		this.score = 0; 
		this.name = name;
	}
	
	public void describe() {
		System.out.println(name + " has " + score + " points!\n");
			for (Card card : playerHand) {
				card.describe();
			}
			System.out.println("-------------------------------------");
	}
	
	public Card flip() {
		Card topCard = playerHand.get(0);
		playerHand.remove(0);
		return topCard;
	}
	//adds card to player hand
	public void draw(Deck deck) {
		Card card = deck.draw();
		playerHand.add(card);
	}
	
	public void incrementScore() {
		this.score++; 
	}
	
}
