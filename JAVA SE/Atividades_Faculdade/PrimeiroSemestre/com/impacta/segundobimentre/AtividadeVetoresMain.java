package com.impacta.segundobimentre;


public class AtividadeVetoresMain {

	public static void main(String[] args) {
		
		int[] vetor;
		
		System.out.println();
		for(int i= 0;i<7;i++){
			System.out.printf(" Exercício %d digíte--> %2d \n",(i+1),(i+1) );
		}
		
		
		
		int atividade = Metodos.capturaINT("\nEscolha a Atividade, Ou digite 0 para sair \n--->");
		
		while(atividade!=0){
		
			switch (atividade) {
			
			case 1://busca por um número dentro de um array.
				
				vetor = new int[20];
				MetodosVetores.preencheVetorInteirosOutPut(vetor);
				
				System.out.println("\n\nO vetor foi preenchido..");
				MetodosVetores.qtdVezesAparece(vetor, Metodos.capturaINT("Qual número você deseja buscar?"));
				
				break;
				
			case 2: //Index com os maiores valores dentro de um array.
				
				vetor = new int[20];
				MetodosVetores.preencheVetorInteirosOutPutIndex(vetor);
				
				System.out.println("\n\nO vetor foi preenchido..");
				MetodosVetores.indexMaiorValor(vetor);
				break;
				
			case 3: //Index com os menores valores dentro de um array.
				
				vetor = new int[20];
				MetodosVetores.preencheVetorInteirosOutPutIndex(vetor);
				
				System.out.println("\n\nO vetor foi preenchido..");
				MetodosVetores.indexMenorValor(vetor);
				
				break;

			case 4:
				
				vetor = new int[20];
				
				MetodosVetores.preencheVetorInteirosOutPutIndex(vetor);
				
				System.out.println("\n\n Vetor com valores invertidos..");
				MetodosVetores.inverterValoresVetor(vetor);
				MetodosVetores.exibirVetorIndex(vetor);
				
			}
		
			atividade = Metodos.capturaINT("\n\nEscolha a Atividade, Ou digite 0 para sair \n--->");
		}
	}
}
