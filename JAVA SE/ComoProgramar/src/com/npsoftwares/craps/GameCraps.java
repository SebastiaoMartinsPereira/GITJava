package com.npsoftwares.craps;


public class GameCraps {

	public static void main(String[] args) {
		
		Craps game = new Craps();
		int x = 0,wins=0,lost=0;
		
		String resul;
		while (x<1000){
			
		resul = game.play().name();
		
		if (resul == "LOST")
		{
			lost++;
		}
		else
		{
			wins++;
		}
			System.out.println("\n\n");

			x++;
		}
		
		System.out.println("Vitorias : " + wins
				           +"\nDerrotas :" + lost);
		
	}
	
}