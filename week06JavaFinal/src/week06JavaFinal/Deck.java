package week06JavaFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();
	
	Deck(){
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				Card card = new Card(number, suit, count);
				this.cards.add(card);
				count ++;
			}										//for each suit in suits, and each number in numbers create a card and add it to the deck
		}
		
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	public void describe() {
		for (Card card : this.cards) {				//describes each card in the array of cards
			card.describe();
		}
	}
	public void shuffle() {
		Collections.shuffle(this.cards);			//shuffles the deck
	}
	public Card draw() {
		Card card = this.cards.remove(0);			//draws the top card in the deck
		return card;
	}
}
