package war;

public class Card {
	
	public static final int CLUBS = 0;
	public static final int SPADES = 1; 
	public static final int DIAMONDS = 2;
	public static final int HEARTS = 3;
	
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int ACE = 14;
	
	private int name;
	private int value; 
	
	//constructor
	public Card(int name, int value) {
		this.setName(name);
		this.setValue(value);
	}
	
	//setters
	private void setName(int cardName) {
		if (cardName >= 0 && cardName <= 3) {
			this.name = cardName;
		} else {
			throw new IllegalArgumentException("Card name must be between 0 and 3");
		}
	} 
	
	private void setValue(int cardValue) {
		if (cardValue < 2 || cardValue > 14) {
			throw new IllegalArgumentException("Card value must be between 2 and 14");
		} else {
			this.value = cardValue;
		}
	}
	
	//getters
	public int getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
	//describes the card
	public String cardToString() {
		String cardStr = "";
		if (value == JACK) {
			cardStr += "Jack";
		} else if (value == QUEEN) {
			cardStr += "Queen";
		} else if (value == KING) {
			cardStr += "King";
		} else if (value == ACE) {
			cardStr += "Ace";
		} else if (value == 2) {
			cardStr += "Two";
		} else if (value == 3) {
			cardStr += "Three";
		} else if (value == 4) {
			cardStr += "Four";
		}else if (value == 5) {
			cardStr += "Five";
		} else if (value == 6) {
			cardStr += "Six";
		} else if (value == 7) {
			cardStr += "Seven";
		} else if (value == 8) {
			cardStr += "Eight";
		} else if (value == 9) {
			cardStr += "Nine";
		} else if (value == 10) {
			cardStr += "Ten";
		} else {
			cardStr += value;
		}
		
		cardStr += " of ";
		
		if (name == CLUBS) {
			cardStr += "Clubs";
		} else if (name == SPADES) {
			cardStr += "Spades";
		} else if (name == DIAMONDS) {
			cardStr += "Diamonds";
		} else if (name == HEARTS) {
			cardStr += "Hearts";
		}
		return cardStr;
		
		}
	
	public void describe() {
		System.out.println(this.cardToString() + "\n");
	}
	
	}
	
	

