package br.com.impacta.estrutura;

import java.util.Scanner;

public class main {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Pilha pImpar = new Pilha();
		Pilha pPar = new Pilha();
		Scanner scan;
		int count=0;
		int entrada;
		scan = new Scanner(System.in);
		
			
		do {
			
			System.out.println("Informe um n�mero qualquer positivo.");
			entrada = scan.nextInt();
			count++;
			if(entrada%2==0){
				pPar.empilhar(entrada);
			}else{
				pImpar.empilhar(entrada);
			}
				
		} while (count<11);{}
		
			System.out.println();
		
		while(!pPar.vazia()){
			
			System.out.println(pPar.desempilhar());
		}
		
			System.out.println("\n\n");
		
		while(!pImpar.vazia()){
			System.out.println(pImpar.desempilhar());
		}
		
	}
}
