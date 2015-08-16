package com.npsoftwares.craps;

import java.util.Random;


public class Craps {

	   //gerador de numeros  aleatórios
	 private static final Random randomNumbers = new Random();
	 
	 
	 //Enumerador com constantes que representam o status do jogo
	enum Status{CONTINUE, WON, LOST};
	 
	 //Constatntes que representam lancamentos dos dados
	 private static final int SNAKE_EYES = 2;
	 private static final int TREY = 3;
	 private static final int SEVEN = 7;
	 private static final int YO_LEVEN = 11;
	 private static final int BOX_CARS =12;
	 
	 
	 //Jaga uma partida de craps.
	 public Status play(){
		 
		 int myPoint = 0; //variavel que recebera pontuação
		 Status gameStatus;  //Irá receber o forma com que se encontra a partida Continue ,Won, Lost
		 
		 int sumOfDice = rollDice(); //primeira rolagem de dados
		 
		 switch (sumOfDice) {
			case SEVEN: //Ganha com 7 no primeiro lancamento
			case YO_LEVEN: //ganha com 11 no primeiro lancamento
				gameStatus = Status.WON;
				break;
				
			case SNAKE_EYES: //perde com 2 no primeiro lancamento
			case TREY: //perde com tres no primeiro lancamento
			case BOX_CARS:  // perde com 12 primeiro lancamento
			    gameStatus = Status.LOST;
			    break;
			    
			default:    //neste caso o jogo continua então  pntuação é regitrada
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice; 
				System.out.printf("Seus pontos %d\n", myPoint);
			}
		 
		 while (gameStatus == Status.CONTINUE)//jogara outra rodada enquanto o status do jogo se mantiver em continue
		 {
			 
			 sumOfDice = rollDice(); //lanca os dados novamente
			 
			 if(sumOfDice == myPoint)//vitoria
			 {
				 gameStatus = Status.WON;
			 }
			 else
			 { 
				 if(sumOfDice == SEVEN) {//perde se atingir o numero sete
					 gameStatus = Status.LOST; 
				 } 
					 
			 }
		 }
		 
		 //exibi uma mensagem de ganhou ou perdeu
		 if(gameStatus == Status.WON){
			 System.out.println("Jogo ganho");
		 }
		 else
		 {
			 System.out.println("Jogo perdido");
		 }
			 
		return gameStatus;	 
	}
	 	 
	 
	 public int rollDice(){
		 int die1 = 1+ randomNumbers.nextInt(6);    //utilizado para o primeiro lançamento do dado
		 int die2 = 1+ randomNumbers.nextInt(6);    //utilizado para o segundo lançamento do dado
		 
		 int sum = die1+die2;   // soma dos valores 
		 
		 
		 //exibe o resultado após o lancamento
		 
		 System.out.println("Dado 1 = "+ die1 + 
                           "\nDado 2 = "+ die2 +
                           "\nResultado = " + sum);
		 
		 return sum;
		 
	 }
	 
	 
}
