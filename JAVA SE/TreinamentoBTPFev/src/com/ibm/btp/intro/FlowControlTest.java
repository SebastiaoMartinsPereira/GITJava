package com.ibm.btp.intro;

import java.util.Scanner;

/**
 * Classe para demonstrar a utilizacao de operadores logicos &&, &, || e |; declaracao de métodos; 
 * controle de fluxo e retorno de metodos
 * 
 * @author icampos
 *
 */
public class FlowControlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Digite um inteiro");
		//pede entrada do usuario pelo teclado
		Scanner in = new Scanner(System.in);
		//metodo nextInt() le um inteiro 
		int number = in.nextInt();
		
		System.out.println("Teste com &");
		//! - operador de negacao 
		//somente um &: força a execucao dos 2 metodos
		if(!isEven(number) & isGreaterThanTen(number)){
			System.out.println("Test OK");
		}
		
		System.out.println("Teste com &&");
		//&&: operador short circuit - se a primeira expressao - !isEven(number) - for falsa, nem executa a segunda.
		if(!isEven(number) && isGreaterThanTen(number)){
			System.out.println("Test OK");
		}
	}
	
	/**
	 * Método que verifica se um numero é par. Se o número é par, imprime uma mensagem.
	 * @param num - o numero a ser verificado
	 * @return boolean - true se o numero é par, false se o numero é impar
	 */
	public static boolean isEven(int num){
		//verifica se o numero é par
		if(num%2==0){
			//o numero é par: imprime a mensagem
			System.out.println("The number " + num + "is even");
			return true;
		}
		//se nao entrou no if e retornou, o numero nao é par: nao há mais nada a fazer, somente retorna falso
		return false;
	}

	/**
	 * Método que verifica se um numero é maior do que dez. Se o número é maior que dez, imprime uma mensagem.
	 * @param num - o numero a ser verificado
	 * @return boolean - true se o numero é maior do que dez, false se o numero é menor
	 */
	public static boolean isGreaterThanTen(int num){
		if(num>10){
			//o numero é maior que 10: imprime a mensagem
			System.out.println("The number " + num + "is greater than 10");
			return true;
		}
		//se nao entrou no if e retornou, o numero é menor que 10: nao há mais nada a fazer, somente retorna falso
		return false;
	}

}
