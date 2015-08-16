package com.npsoftwares.passeiodocavalo;

import java.util.Random;


public class PasseiodoCavalo {

	int[][] xadrez = new int[8][8];
	int[] vertical = { -1, -2, -2, -1, 1, 2, 2, 1 };
	int[] horizontal = { 2, 1, -1, -2, -2, -1, 1, 2 };

	int currentRow;
	int currentColumn;
	int countRodadas = 0;
	int jogadaInvalida = 0;

	private void moveNumber(int moveNumber) {
		this.currentRow += vertical[moveNumber];
		this.currentColumn += horizontal[moveNumber];
	}

	public void reiniciaXadrez() {
		this.countRodadas = 0;
		for (int linha = 0; linha < xadrez.length; linha++) {
			for (int coluna = 0; coluna < xadrez[linha].length; coluna++) {
				xadrez[linha][coluna] = 0;
			}
		}
	}
	

	private void executeMove(int row, int column) {
		xadrez[row][column] += 1;
		System.out.println(row + "  " + column);
	}
	

	private boolean validarMovimento(int moveNumber) {

		boolean permitido;
				
		int nextVertical  =  this.currentRow +  vertical[moveNumber];
		int nextHorizontal = this.currentColumn + horizontal[moveNumber];
		
		if (nextVertical >= 0 && nextVertical <= 7 && nextHorizontal >= 0 && nextHorizontal <= 7) {
			
			if(this.xadrez[nextVertical][nextHorizontal]>=4){
				permitido = false;
			}else{
				permitido = true;
			}

		} else {
			permitido = false;
		}

		return permitido;
	}
	

	public void rodada() {

		Random ram = new Random();

		do {
			if (this.countRodadas == 0) {
				this.currentRow = 0;
				this.currentColumn = 0;
			}

			int move = ram.nextInt(7);
			
			if (validarMovimento(move)) {
				
				this.moveNumber(move);
				this.executeMove(this.currentRow, this.currentColumn);
				this.countRodadas++;
				
			} else {
				if(++jogadaInvalida ==50){
					System.out.println("Fim do jogo");
					return;
				}
			}

		} while (this.countRodadas <= 1000);
        
		this.displayRodada();
	}
	
	private void displayRodada(){
		
		System.out.println("\n");
		System.out.println("\n");
		for (int linha = 0; linha < xadrez.length; linha++) {
			for (int coluna = 0; coluna < xadrez[linha].length; coluna++) {
				System.out.printf("%4s",xadrez[linha][coluna]);
			}
			System.out.println("\n");
		}
	}
}
