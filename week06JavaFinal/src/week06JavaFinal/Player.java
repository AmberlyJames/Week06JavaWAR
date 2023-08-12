package week06JavaFinal;

import java.util.List;

public class Player {
	
	String name;
	List<Card> hand;
	Integer score;
	


	Player(String name, List<Card> hand, int score){
		this.name = name;
		this.hand = hand;
		this.score = 0;
		}
	
	
	
	public Card flip() {
		Card card = this.hand.remove(0);		//removes the top card from player's hand and returns that card
		return card;
	}
	public void draw(Deck deck) {				//draws a card from the deck and adds that card to the player's hand
		Card card = deck.draw();
		this.hand.add(card);
	}
	public void incrementScore() {				//Increments the score by 1
		this.score ++;
	}
	
	
	public List<Card> getHand() {
		return hand;
	}


	public void setHand(List<Card> hand) {
		this.hand = hand;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
	public void describe() {
		System.out.println(name + " has a score of " + score + " and has the following hand: ");
		for (Card card : hand) {
			card.describe();
			
		}	
	}
}
