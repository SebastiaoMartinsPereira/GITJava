package com.npsoftwares.learning;

public class LearningTest {

	public static void main(String[] args) {

		int count=0;
		int acertos = 0;
		
		//Seleciona o  Tipo de calculo que será realizado durante o jogo
		LearningMulti.selecionarTipoCalculo();
		
		//Seleciona o nivel a ser jogado
		LearningMulti.geraNivelJogo();
		
		//Realiza uma determinada quatidade de rodadas
		do{
			++count;
			
			if(LearningMulti.realizaPergunta()==true){
				acertos++;
			}
		}while(count<10);
	
		//finalizao jogo informando a quanidade de acerto e de erros  do usuário.
		LearningMulti.geraCalculo(acertos, 10);
	}

}
