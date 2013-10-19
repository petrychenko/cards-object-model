package org.petrychenko.cards.rummy.logic;

import org.petrychenko.cards.rummy.model.Deck;

/**
 * 
 * Both builder and template class
 * 
 * */
public abstract class DeckBuilder {
	
	public Deck buildDeck(){
		Deck deck = new Deck();
		return this.fillDeck( deck );
	}
	
	public abstract Deck fillDeck( Deck deck );

}
