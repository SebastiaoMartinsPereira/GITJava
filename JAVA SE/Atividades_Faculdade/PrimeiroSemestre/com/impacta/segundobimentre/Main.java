package com.impacta.segundobimentre;


public class Main {

	public static void main(String[] args) {
		
		System.out.println();
		for(int i= 0;i<7;i++){
			System.out.printf(" Exercício %d digíte--> %2d \n",(i+1),(i+1) );
		}
		
		
		
		int atividade = Metodos.capturaINT("\nEscolha a Atividade, Ou digite 0 para sair \n--->");
		
		while(atividade!=0){
		
			switch (atividade) {
			case 1:
				
				MetodosVetores.verificarMenor();
				
				break;
				
			case 2:
				
				System.out.println("\n\nPreencher e somar Vetores");
				System.out.println();
				MetodosVetores.preencherVetores(10);
				break;
				
			case 3:
				
				System.out.println("\nPreencher e somar Vetores");
				MetodosVetores.preencherVetores(Metodos.capturaINT("\nQuantidade de números a somar: "));
				break;
				
			case 4:
				
				System.out.println("\nSomar valores em um vetor:\n");
				int[] array = new int[Metodos.capturaINT("Digite o tamanho do vetor")];
				MetodosVetores.preencheVetorInteirosOutPut(array);
				System.out.println("\nTotal : " + MetodosVetores.SomarValorVetor(array, array.length));
				break;
				
			case 5:
				
				System.out.println("\nIndex com maior valor\n");
				int[] maiorValor = new int[Metodos.capturaINT("Digite o tamanho do vetor")];
				MetodosVetores.preencheVetorInteirosOutPut(maiorValor);
				MetodosVetores.indexMaiorValor(maiorValor);
			    break;
			    
			case 6:
				
				System.out.println("\nQuantidade de vezes que um número aparece no array:\n");
				int[] tamanho = new int[Metodos.capturaINT("Digite o tamanho do vetor")];
				int busca = Metodos.capturaINT("Número a ser buscado: ");
				MetodosVetores.preencheVetorInteirosOutPut(tamanho);
				MetodosVetores.qtdVezesAparece(tamanho,busca);
			    break;
			    
			case 7:
				
				System.out.println("\nQuantidade de números pares no array :\n");
				int[] pares = new int[Metodos.capturaINT("Digite o tamanho do vetor")];
				MetodosVetores.preencheVetorInteirosOutPut(pares);
				MetodosVetores.contagemPares(pares, pares.length);
			    break;
			}
		
			atividade = Metodos.capturaINT("\n\nEscolha a Atividade, Ou digite 0 para sair \n--->");
		}		
  }
}
