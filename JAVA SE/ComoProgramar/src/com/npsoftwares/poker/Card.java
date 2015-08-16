package com.npsoftwares.poker;

public class Card {

	private String face;
	private String suit;
	
	//Coontrutor da classe
	public Card(String cardFace,String cardSuit){
		this.face = cardFace; 
		this.suit = cardSuit;
	}
    
	@Override
	public String toString(){ //retorna uma string formada pela carta e pelo naipe
		return this.face + " of " + this.suit;
	}

}
