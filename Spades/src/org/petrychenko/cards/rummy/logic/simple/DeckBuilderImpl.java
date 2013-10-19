package org.petrychenko.cards.rummy.logic.simple;

import org.petrychenko.cards.rummy.logic.DeckBuilder;
import org.petrychenko.cards.rummy.model.Card;
import org.petrychenko.cards.rummy.model.Deck;
import org.petrychenko.cards.rummy.model.Grades;
import org.petrychenko.cards.rummy.model.Suits;

public class DeckBuilderImpl extends DeckBuilder{

	@Override
	public Deck fillDeck(Deck deck) {
		for( Suits suit : Suits.values() ){
			for( Grades grade : Grades.values() ){
				if( grade.equals(Grades.Jocker) ){
					continue;
				}
				Card card = new Card(suit,grade);
				deck.addCard(card);
			}
		}
		return deck;
	}

}
