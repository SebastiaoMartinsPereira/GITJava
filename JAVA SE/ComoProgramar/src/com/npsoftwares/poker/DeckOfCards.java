package com.npsoftwares.poker;

import java.util.Random;

public class DeckOfCards {
	
	private Card[] deck; //Array de objetos Card
	private int  currentCard; //indice do proximo card a ser distribuido
	private static final int NUMBER_OF_CARDS = 52;
	private static final Random random = new Random();
	
	//construtor preenche baralho de cartas
	public DeckOfCards(){
		//array com todas os numero de um baralho
		String[] faces = {"Ace","Deuce","Three","Four","Five","Six","Seven"
				         ,"Eigth","Nine","Ten","Jack","Queen","King"};
		
		//array com todos os mnaipes de um baralho
		String[] suits ={"Hearts","Diamonds","Clubs","Spades"};
		
		this.deck = new Card[NUMBER_OF_CARDS];//cria o array de objetos Card com 52 objetos
		this.currentCard=0; // set o current card como 0 para que o primeiro card a ser distribuido seja o deck[0] 
	    
		//preenche car objeto card 
		for(int count =0;count< deck.length;count++){
			deck[count]= new Card(faces[count%13],suits[count/13]);
		}
	}
	
	
	//algoritmo para embaralhar as cartas
	public void shuffle(){
		
		currentCard=0; //reinicia a carta corrente
		
		
		//seleciona para cada carta outro aleatório e faz uma comparação
		for(int first =0;first<deck.length;first++){
			
			int second = random.nextInt(NUMBER_OF_CARDS); //gera um numero aleatório para ser usado na comparação
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second]=temp;
		}
	}
	
	//distribui as cartas
	public Card dealCard(){
		
		//determina se ainda existem cartas para serem distribuidas
		if (currentCard<deck.length){
			return deck[currentCard++];
		}else{
			return null;
		}
	}
	
}
