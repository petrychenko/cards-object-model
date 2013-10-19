package org.petrychenko.cards.rummy.model;

public class Card {
	
	private Suits suit;
	private Grades grade;
	
	public Card(Suits suit, Grades grade) {
		this.suit = suit;
		this.grade = grade;
	}

	public Suits getSuit() {
		return suit;
	}

	public Grades getGrade() {
		return grade;
	}
	
	public String toString(){
		String string_suit = null == suit ? "" : suit.toString();
		String string_grade = (grade.ordinal() > 1 && grade.ordinal() <=10 ) ? ""+grade.ordinal() : ""+grade;
		return " "+string_grade+" "+string_suit;
	}
	

}
