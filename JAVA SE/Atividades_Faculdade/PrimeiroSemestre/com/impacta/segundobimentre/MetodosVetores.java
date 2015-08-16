package com.impacta.segundobimentre;

import static com.impacta.segundobimentre.MetodosVetores.*;

import java.util.Random;

@SuppressWarnings("unused")
public class MetodosVetores {

	static Random ram = new Random();

	// retorna o menor número contido em um vetor.
	public static int menorNumeroVetor(int[] vetor) {

		int menor;
		menor = vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}

		return menor;
	}

	// Verifica o menor valor contido em um array.
	public static void verificarMenor() {

		int tamaho = Metodos.capturaINT("\nDigite o tamanho do Array.");

		int array[] = new int[tamaho];

		System.out.println("\nGerar numeros automático:");
		System.out.println();
		MetodosVetores.preencheVetorInteirosOutPut(array);
		System.out.println();
		System.out.println("\nO menor valor informado foi : "
				+ MetodosVetores.menorNumeroVetor(array));
	}

	// Preenche vetor de inteiros com dados do usuário.
	public static void preencheVetorUsuario(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = Metodos.capturaINT("Digito a valor para o campo "
					+ (i + 1) + "\n");
		}
	}

	// Preenche um vetor de númeors reais.
	public static void preencheVetorReais(double[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = ram.nextDouble();
			System.out.printf(" %4d", array[i]);
		}
	}

	// Preenche um vetor de números inteiros.
	public static void preencheVetorInteiros(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = ram.nextInt(100);
			System.out.printf(" %4d", array[i]);
		}
	}

	// Preenche um vetor de inteiros e exibe uma saída com os valores.
	public static void preencheVetorInteirosOutPut(int[] array) {

		for (int i = 0; i < array.length; i++) {

			array[i] = ram.nextInt(30);// gera números aleátorios

			if (i % 5 == 0) {// quebra a linha a cada 5 saídas.
				System.out.println();
			}

			System.out.printf("%s %4d %s", "|", array[i], "|");// Exibe os valores
		}
	}

	// Preenche um vetor de inteiros e exibe uma saída com os valores.
	public static void preencheVetorInteirosOutPutIndex(int[] array) {

		for (int i = 0; i < array.length; i++) {

			array[i] = ram.nextInt(30);// gera números aleátorios

			System.out.println();

			System.out.printf("Vetor[%2d] %s %4d %s", i, "-->", array[i], "|");// Exibe os valores
		}
	}

	// Soma dois vetores e exibe o resultado.
	public static void somarVetores(int[] vetorA, int[] vetorB, int tamanho) {

		int[] vetorSoma = new int[tamanho];

		for (int i = 0; i < vetorSoma.length; i++) {
			vetorSoma[i] = vetorA[i] + vetorB[i];
		}

		exibirVetor(vetorSoma);
	}

	// Soma todos os valores contidos em um vetor.
	public static int SomarValorVetor(int[] vetor, int tamanho) {

		int somaTotal = 0;
		for (int i = 0; i < tamanho; i++) {
			somaTotal += vetor[i];
		}
		return somaTotal;
	}

	// Recupera os index onde estão armazenados os maiores valores.
	public static void indexMaiorValor(int[] vetor) {

		int maior = vetor[0];
		int index = 0;
		String indexMaiorValor = "";

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] >= maior) {

				maior = vetor[i];

				if (maior == vetor[index]) {
					indexMaiorValor += i + "|";
				} else {
					indexMaiorValor = String.valueOf(i) + "|";
				}

				index = i;
			}
		}

		System.out.println("\n\nO index com o maior valor é : "
				+ indexMaiorValor);
	}

	// Recupera os index onde estão armazenados os menores valores.
	public static void indexMenorValor(int[] vetor) {

		int menor = vetor[0];
		int index = 0;
		String indexMenorValor = "";

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] <= menor) {

				menor = vetor[i];

				if (menor == vetor[index]) {
					indexMenorValor += i + "|";
				} else {
					indexMenorValor = String.valueOf(i) + "|";
				}

				index = i;
			}
		}

		System.out.println("\n\nO index com o maior valor é : "
				+ indexMenorValor);
	}
     
	//Inverte os valores de um array
	public static void inverterValoresVetor(int[] vetor) {

		int aux;
		for (int i = 0; i < vetor.length - 1; i++) {
			for (int j = 0; j < vetor.length - i - 1; j++) {
				aux = vetor[j];
				vetor[j] = vetor[j + 1];
				vetor[j + 1] = aux;
			}
		}
	}

	// Recebe um vetor preenchido e um numero que deseja ser buscado pelo usuário.
	public static void qtdVezesAparece(int[] vetor, int numeroBusca) {

		int contBusca = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroBusca) {
				contBusca++;
			}
		}
		System.out.printf("\n O número %d aparece %d veze(s) no array",
				numeroBusca, contBusca);
	}

	// Verifica a quantidade de numeros pares em vetor.
	public static void contagemPares(int[] vetor, int tamanho) {

		int pares = 0;
		for (int i = 0; i < tamanho; i++) {
			if (vetor[i] % 2 == 0) {
				pares++;
			}
		}
		System.out.printf("\n Existem %d números pares no array", pares);
	}

	// //Preeenche dois vetores soma seus valores e armazena em um terceiro vetor.
	public static void preencherVetores(int tamanho) {

		int[] vetorA, vetorB;

		vetorA = new int[tamanho];
		vetorB = new int[tamanho];

		System.out.println(" --------------- VETOR A ---------------");
		preencheVetorInteirosOutPut(vetorA);

		System.out.println("\n\n--------------- Vetor B ---------------");
		preencheVetorInteirosOutPut(vetorB);

		System.out.println("\n\n--------------- Soma dos valores ------------");

		somarVetores(vetorA, vetorB, vetorA.length);

	}

	// Exibe um vetor.
	public static void exibirVetor(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%s %4d %s", "|", array[i], "|");
		}

	}

	// Exibi um vetor com o valor e o index.
	public static void exibirVetorIndex(int[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.println();

			System.out.printf("Vetor[%2d] %s %4d %s", i, "-->", array[i], "|");// Exibe os valores
		}
	}
	
	//Ordena um array de inteiros
	public static void orderArray(int[] array) {
		
		int aux; // variável auxiliar 
		
		for (int i = 0; i < array.length - 1; i++) { //percorre todos os números de um array.
			
			for (int j = 0; j < array.length - 1 - i; j++) { // leva o número na possição 1 até sua posição final
				
				if (array[j] > array[j + 1]) {
					
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
					
				}
				
			}
		}
	}

	//busca de um número em um array.
	public static int buscaLinear(int[] array, int numeroBuscado) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == numeroBuscado) {
				return i;
			}
		}

		return -1;
	}
	
	//Busca de um npumero em um array.
	public static int buscaBinaria(int[] array,int searchNumber){
		
		int begin = 0;
		int end = array.length;
		int middle;
        orderArray(array);
        
        System.out.println("Vetor ordenado:");
        exibirVetorIndex(array);
		while (begin != end) {
			middle = (begin + end) / 2;
			if (searchNumber == array[middle]) {
				return array[middle];
			} else {
				if (searchNumber < array[middle]) {
					end = middle-1;
				} else {
                    begin = middle+1;
				}
			}
		}

		return -1;
	}
	
	
	//realiza uma busca dentro de um array utilizando o forma Linear
	public static void RealizaBuscaLinear(int length){
		
		int[] array= new int[length];
		
		int result;
		System.out.println("Preenchendo array:");
		
		preencheVetorInteirosOutPutIndex(array);
		
		result = (buscaLinear(array, Metodos.capturaINT("\n\nQual número deseja encontrar?")));
		
		if(result>0){
			System.out.println("\n\nO número encontra-se no Index " + result);
		}else{
			System.out.println("\n\nO número não existe no array");
		}
	}


	//método para realizar uma busca em um array utilizando o maneira Binaria.
	public static void RealizaBuscaBinaria(int length){
		
		int[] array= new int[length];
		
		int result;
		System.out.println("Preenchendo array:");
		
		preencheVetorInteirosOutPutIndex(array);
		
		result = (buscaBinaria(array, Metodos.capturaINT("\n\nQual número deseja encontrar?")));
		
		if(result>0){
			System.out.println("\n\nO número encontra-se no Index " + result);
		}else{
			System.out.println("\n\nO número não existe no array");
		}
	}

}
