package org.petrychenko.cards.rummy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.petrychenko.cards.rummy.logic.DeckBuilder;
import org.petrychenko.cards.rummy.logic.complex.ExtDeckBuilderImpl;
import org.petrychenko.cards.rummy.logic.simple.DeckBuilderImpl;
import org.petrychenko.cards.rummy.model.Deck;

public class Rummy {

	public static void main(String[] args) {

		while (true) {
			System.out
					.println("Rummy. Select a game type: [Any Key] Exit,  [1] Simple, [2] Complex");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String in;
			try {
				in = br.readLine();
				DeckBuilder builder = null;
				if (in.startsWith("1")) {
					builder = new DeckBuilderImpl();
				} else if (in.startsWith("2")) {
					builder = new ExtDeckBuilderImpl();
				} else {
					System.exit(0);
				}
				
				Deck deck = builder.buildDeck();
				System.out.println(  deck.toString() );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}

	}

}
