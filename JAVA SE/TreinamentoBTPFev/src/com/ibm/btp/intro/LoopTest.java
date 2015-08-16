package com.ibm.btp.intro;

import java.util.Scanner;

/**
 * Classe para demonstrar o uso de loops. 
 * 
 * Outros conceitos como arrays e comparacao de strings sao demonstrados.
 * 
 * @author icampos
 *
 */
public class LoopTest {
	
	//senha correta
	private static String realPassw = "12345";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scannerIn = new Scanner(System.in);
		
		/*
		 * 1. Usando um loop while para tomar acoes quando nao sabemos o numero de repeticoes;
		 * Aqui iremos executar um loop para pedir a senha do user até que ele acerte, sem
		 * limite no numero de tentativas.
		 */
		
		//variavel de controle para o loop
		boolean control = false;
		System.out.println("Para seu acesso ser liberado, digite sua senha");
		//enquanto control for false, !control da verdadeiro e o loop continua executando
		while(!control){
			//lendo entrada do usuario pelo teclado
			String userTrial = scannerIn.nextLine();
			//usa o metodo isPasswordOk(userTrial) para checar se a senha esta correta
			if(isPasswordOk(userTrial)){
				//se a senha esta correta, imprime mensagem de boas vindas
				System.out.println("Bem vindo!");
				//variavel de controle = true;
				control=true;
				//quebra o loop
				break;
			}
			else{
				//senha incorreta, pede pro usuario digitar a senha novamente
				System.out.println("Senha incorreta! tente novamente");
			}
		}
		
		/*
		 * 2. Testando um loop while - descomente para executar
		 */
		//printWhile();
		
		/*
		 * 3. Testando um loop do/while - descomente para executar
		 */
		//printDoWhile();
		
		/*
		 * 4. Testando um loop for - descomente para executar
		 */
		//printFor();
		
		/*
		 * 5. Testando um loop com enhanced for - descomente para executar
		 */
		//printEnhancedFor();
		
	}

	/**
	 * Exemplo de loop while
	 * 
	 * Em um loop while, a condicao é testada primeiro e as instrucoes do loop sao executadas somente se
	 * a condicao é satisfeita
	 */
	public static void printWhile(){
		int i = 0;
		while(i>5){
			System.out.println(i);
			i++;
		}
	}
	

	/**
	 * Exemplo de loop do/while
	 * 
	 * Em um loop do/while, as instrucoes dentro do loop sao executadas pelo menos uma vez, depois a condicao é 
	 * verificada; se satisfeita, as instrucoes sao repetidas; se nao é satisfeita, sai do loop
	 */
	public static void printDoWhile(){
		int i = 0;
		do{
			System.out.println(i);
			i++;
		}while(i>5);
	}
	
	/**
	 * Exemplo de loop for
	 * 
	 * O loop for obedece a seguinte sintaxe:
	 * for(valor inicial da variavel ; condicao booleana envolvendo a variavel; atualizacao da variavel){ ... }
	 * 
	 * Nesse exemplo, usamos a variavel i inicializada como 0; a cada iteracao o valor de i sera incrementado em 1 (i++);
	 * as instrucoes dentro do for serao repetidas enquanto o valor de i satisfizer a condicao de ser menor que
	 * o comprimento do array listInts
	 * 
	 */
	public static void printFor(){
		//inicializando um array: arrays sao objetos, sao instanciados com o operador new
		//ou tambem seus valores podem ser setados diretamente como em 
		//int[] listInts = { 1,3,5,7};
		int[] listInts = new int[4];
		
		//nao inicializamos os elementos do array! mas seus elementos sao inicializados pelo 
		//operador new com o valor zero, por ser do tipo int (variavel primitiva)
		//new inicializa atributos de objetos e elementos de arrays com 0 se for tipo primitivo (int, chat, double, etc) ou com null se for do tipo composto (classe)
		for(int i=0; i<listInts.length; i++){
			//vai imprimir zeros
			System.out.println(listInts[i]);
		}
	}
	
	/**
	 * Exemplo de loop enhanced for
	 * 
	 * Sintaxe:
	 * for(Tipo nomeDaVarProElemento : nomeDoArray){ ... }
	 * 
	 * Nesse exemplo, usamos a variavel elem pra percorrer o array; esse loop percorre todos os elementos do array.
	 * a cada iteracao, a variavel elem assume o valor de um elemento do array listInts
	 * 
	 */
	public static void printEnhancedFor(){
		int[] listInts = new int[4];
		
		//for comum - inicializando o array
		//usamos a propriedade lenght pois, ao contrario desse exemplo, nem sempre sabemos o tamanho do nosso array
		//se nossas instrucoes dependem da posicao do elemento, precisamos usar o for comum
		for(int i=0; i<listInts.length; i++){
			//listInts[i] - pega a posicao i do array e inicializa com o valor i*5
			listInts[i] = i*5;
		}
		
		//for each  - "for each element into the array, or collection"
		for(int elem : listInts){
			//imprime o elemento
			System.out.println(elem);
		}
		
	}
	
	/**
	 * Check if user input for password match the specified password - stored into realPassw attribute
	 * @param passw - the password the user typed
	 * @return boolean - true if this is the correct password, false otherwise
	 */
	public static boolean isPasswordOk(String passw){
		//comparamos Strings sempre com equals! Strings sao objetos, entao variaveis que guardam strings 
		//guardam referencias (ponteiros) e nao valores! Nao podemos usar == para comparar strings!
		return passw.equals(realPassw);
	}
	
	
}
