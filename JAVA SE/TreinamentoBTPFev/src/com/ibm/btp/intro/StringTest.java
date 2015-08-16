package com.ibm.btp.intro;

/**
 * Classe para demonstrar inicializacao, composicao e comparacao de strings
 * 
 * 
 * @author icampos
 *
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//declarando uma string
		String myString = "Teste";

		//Strings sao imutaveis: toda vez que concatenamos strings, uma nova string é criada
		//Esse é um ponto negativo de performance
		String composedString = "somando na primeira string: " + myString;
		String theString = new String("Instanstiating with "
				+ "new operator");
		System.out.println(composedString);
		
		int comprimento = composedString.length();
		int comprimento2 = "testando comprimento diretamente".length();
		//String é uma classe do java; toda String é um objeto, e podemos inicializar uma string também com
		//o operador new
		String testChars1 = new String("abcdef");
		//pegando caracteres da string em uma dada posicao: na posicao 0, temos a letra 'a' - zero indexed
		char ch = testChars1.charAt(0);
		System.out.println("ch: " + ch);
		
		//Comparando strings: como Strings sao objetos, devemos usar o equals, nao o == (ver tb a classe ReferenceTest)
		String string1 = "minha primeira string";
		System.out.println(string1.equals("minha primeira string"));
	}

}
