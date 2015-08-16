package com.impacta.primeirobimestre;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		int linha=0,y=0;
		String mens="* ";
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um valor de 1 a 20 :");
		int num = scan.nextInt();
		
		//Dentro deste while e feito o quadrado.
		while (linha<num)
		{
			//Neste bloco do if e criado a primeira linha do quadrado.  SENTIDO HORIZONTAL
			if (linha==0){ //verifica se � a primeira linha
				for(int x=0;x<num;x++){
					System.out.print(mens); //imprime a linha de (*)
					if(x==(num-1)){
						System.out.println("");//pula a linha quando chegar no �ltimo (*)
					}
				}
			//aqui ser� criado desde a segunda linha do quadrado at� a penultima linha  ''SENTIDO HORIZONTAL
			}else if(linha >0 && linha < num-1){
				for(int x=0;x<num;x++){
				    if(x==0 || x==num-1){
				    	System.out.print(mens); //imprime o primeiro(*) e o ultimo (*) de cada linha. 
				    }
				    else{
				    	
				    	System.out.print("  "); //imprime espa�os vazios para montar o interior do quadrado.
				    }
					if(x==(num-1)){
						System.out.println("");//pula linha a linha
					}
				}
			//Aqui � criado a ultima linha do quadrado            ''SENTIDO HORIZONTAL
			}else{
				
				for(int x=0;x<num;x++){
					System.out.print(mens); //imprime a linha de (*)
					if(x==(num-1)){
						System.out.println("");
					}
				}	
			}
			
		linha++;
		}				
	}
}
