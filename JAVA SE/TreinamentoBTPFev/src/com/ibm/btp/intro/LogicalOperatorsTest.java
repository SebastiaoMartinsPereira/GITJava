package com.ibm.btp.intro;

/**
 * Classe para mostrar a sintaxe de utilizacao dos operadores logicos.
 * 
 * Para verificar a diferenca entre os operadores && e & (|| e |), veja a classe FlowControlTest
 * 
 * @author icampos
 */
public class LogicalOperatorsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		int c = 9;
		
		//&& - AND - operador short circuit - se encontra uma expressao falsa, ja retorna falso, nem avalia as proximas
		//para o AND ser verdadeiro, todas as expressoes precisam ser verdadeiras; se uma delas for falsa, da false
		if((a>b) && c==9 && (b<c)){
			System.out.println("Condicao satisfeita!");
		}
		else{
			System.out.println("Condicao NAO satisfeita!");
		}
		
		//|| - OR - operador short circuit - se encontra uma expressao verdadeira, ja retorna falso, nem avalia as proximas
		//para o OR ser verdadeiro, pelo menos uma das expressoes precisa ser verdadeira
		//Entao, se ele encontra a primeira expressao verdadeira, ele nem avalia as proximas
		if((a>b) || c==9 || (b<c)){
			System.out.println("Condicao satisfeita!");
		}
		else{
			System.out.println("Condicao NAO satisfeita!");
		}
		
		//& - AND - segue a mesma logica do &&, mas força a execucao de todas as expressoes.
		if((a>b) & c==9 & (b<c)){
			System.out.println("Condicao satisfeita!");
		}
		else{
			System.out.println("Condicao NAO satisfeita!");
		}
		
		// | - OR - segue a mesma logica do ||, mas força a execucao de todas as expressoes.
		if((a>b) | c==9 | (b<c)){
			System.out.println("Condicao satisfeita!");
		}
		else{
			System.out.println("Condicao NAO satisfeita!");
		}
		
		boolean a1=true;
		boolean b1=true; 
		boolean c1=false;
		
		boolean d = a1 && b1 || c1;
		System.out.println("d=" + d);

	}

}
