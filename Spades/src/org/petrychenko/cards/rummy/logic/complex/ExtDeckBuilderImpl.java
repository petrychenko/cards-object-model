package org.petrychenko.cards.rummy.logic.complex;

import org.petrychenko.cards.rummy.logic.simple.DeckBuilderImpl;
import org.petrychenko.cards.rummy.model.Card;
import org.petrychenko.cards.rummy.model.Deck;
import org.petrychenko.cards.rummy.model.Grades;

public class ExtDeckBuilderImpl extends DeckBuilderImpl {

	@Override
	public Deck fillDeck(Deck deck) {
		deck =  super.fillDeck(deck);
		deck.addCard( this.createJocker() );
		deck.addCard( this.createJocker() );
		return deck;
	}

	private Card createJocker() {
		return new Card(null, Grades.Jocker);
	}
	
	

}
