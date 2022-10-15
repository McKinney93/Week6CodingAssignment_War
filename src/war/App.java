package war;

public class App {

	public static void main(String[] args) {
		//deck & shuffle deck 
		Deck allDeck = new Deck();
		allDeck.shuffle();
		
		//players
		Player player1 = new Player ("Onyx");
		Player player2 = new Player ("Otis");
		
		//deals 26 cards to each player using draw method in player class
		for (int c = 1; c <= 26; c++) {
			player1.playerHand.add(allDeck.draw());
			player2.playerHand.add(allDeck.draw());
		}
		
		//calls describe method from Player class to display player & player hand
		player1.describe();
		player2.describe();
		
		//calls flip method from player class 
		for (int i = 1; i <= 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
		//compares card values through each player's hand and increments a point to winning player using increment score method in player class	
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
			} else {
				System.out.println("\nDRAW!\n");
			}
		}

		if (player1.score > player2.score) {
			System.out.println("-------------------------------------\n");
			System.out.println("The final score for " + player1.name + " is: " + player1.score + "\n");
			System.out.println("The final score for " + player2.name + " is: " + player2.score + "\n");
			System.out.println(player1.name + " wins this round! \n");
			System.out.println("------------------------------------\n");
		} else if(player2.score > player1.score) {
			System.out.println("-------------------------------------\n");
			System.out.println("The final score for " + player1.name + " is: " + player1.score + "\n");
			System.out.println("The final score for " + player2.name + " is: " + player2.score + "\n");
			System.out.println(player2.name + " wins this round! \n");
			System.out.println("-------------------------------------\n");
		} else {
			System.out.println("-------------------------------------\n");
			System.out.println("The final score for " + player1.name + " is: " + player1.score + "\n");
			System.out.println("The final score for " + player2.name + " is: " + player2.score + "\n");
			System.out.println("Draw! There are no winners this round!\n");
			System.out.println("-------------------------------------\n");
		}
	}

}
