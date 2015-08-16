package com.ibm.btp.intro;

/**
 * Classe para mostrar os tipos primitivos do Java
 * 
 * @author icampos
 *
 */
public class PrimitiveTypesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Existem 3 grupos principais de tipos primitivos:
		
		//1. NUMEROS
		
		//inteiros - menor capacidade para maior capacidade - signed (positivo ou negativo)
		byte b = 10;
		short s = 10;
		int i = 10;
		long l = 10;
		
		//ponto flutuante - menor precisao para maior precisao - signed (positivo ou negativo)
		float f = 10.0f;
		double d = 10.0;
		
		double d2 = 10.0d;
		double d3 = 10.0D;
		double d4 = 10d, d5=10D;
		
		float f2 = 10.0f;
		float f3 = 10.0F;
		float f4 = 10f, f5=10F;
		
		//2. CHAR -unsigned - sem sinal
		char c1 = 'a'; //para caracteres usamos aspas simples
		char c2 = 10;
		
		//3. BOOLEANOS - TRUE/FALSE
		boolean bool = true;
		boolean bool2 = false;
		
		//Aspas duplas sao usadas para Strings. Strings sao cadeias de caracteres (podendo ser vazias). String eh uma classe, portanto Strings inicializadas
		//sao objetos. Portanto isso nao compila: ele interpreta o "a" como String e nao como char.
		//char c3 = "a"; 
		
		//char eh unsigned; nao podemos atribuir a ele um numero negativo
		//char c4 = -10;
		
		//podemos passar valores de tipos menores para variaveis de tipos maiores. 
		byte b2 = 5;
		int i2 = b2;
		
		
		//nao podemos passar valores de tipos maiores para variaveis de tipos menores sem cast
		int i3 = 7;
		//byte b3 = i3;
		byte b3 = (byte) i3; //com cast - ok
		
		//quebra a parte fracionaria, pegando so a parte inteira
		float myFloat = 10.5f;
		int myInt = (int) myFloat;
		
		//codigo na tabela ascii
		char characterVar = 'b';
		int code = characterVar;
		System.out.println("code: " + code);
		
		//caractere da tabela ascii com codigo 70
		int number = 70;
		char myChar = (char) number;
		System.out.println("myChar: " + myChar);
	}

}
