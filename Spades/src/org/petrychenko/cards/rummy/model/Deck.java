package org.petrychenko.cards.rummy.model;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	/*we need a pre-defined sequence to be kept. Also we can say in advance that no more 58 cards will be used 4x13+2=54*/
	private final List<Card> cards = new ArrayList<Card>(54);
	
	public void addCard(Card card){
		cards.add(card);
	}
	
	public void shuffle(){
		//some fancy shuffling based on Random. I have some ideas but got no time 
	}
	
	public Card getNext(){
		if( cards.isEmpty() ){
			return null;
		}
		Card nextCard = cards.remove(0);
		return nextCard;
	}
	
	public String toString(){
		StringBuffer buf = new StringBuffer("Deck: \n");
		for(Card card : cards){
			buf.append(card).append("\n");
		}
		return buf.toString();
	}

}
