package br.com.impacta.estrutura.ordenacao;

public class InsertionSort {

	public static void main(String[] args) {
		double[] numeros = new double[10];

		for (int i = 9; i >= 0; i--) {
			numeros[9-i] = i+1;
		}
		
		for(double num : insertionSort(numeros)){
			System.out.println("num - " + num);	
		}

	}

	public static double[] insertionSort(double[] numeros) {
		//declare��o de variaveis.
		int i, j;
		double daVez;//numero da rodada a ser verificado.

		for (i = 1; i < numeros.length; i++) { //iterage em todos os elementos do array.

			daVez = numeros[i]; //recupero o valor para o numero a ser validado

			j = i;//seto a vari�vel j com sendo o valor contido em i

			while ((j > 0) && (numeros[j - 1] > daVez)) {//iterar enquanto j for > 0 
				//verifica se o numero anterior contido no index atual -1 � maior que o valor contido no index atual.
				//caso seja faz a troca
				numeros[j] = numeros[j - 1]; //verifico se o valor contido no index j � 
				j = j - 1;//decremento o j
			}
			numeros[j] = daVez;
		}

		return numeros;

	}
}
