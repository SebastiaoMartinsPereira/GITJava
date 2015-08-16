package com.ibm.btp.intro;

public class OperatorsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// "=" eh um operador de atribuicao: passa o que temos no lado direito para o lado esquerdo
		int a = 5;
		int a1, a2, a3;
		a1=a2=a3=6;
		System.out.println("a1 " + a1 + " a2 " + a2 + " a3 " + a3);
		
		int a4, a5, a6=6;
		//erro de compilacao: ele so inicializou a a6; a4 e a5 nao estao inicializadas
		//System.out.println("a4" + a4 + "a5" + a5 + "a6" + a6);
		
		int a7=a4=a5=6; //somente a7 eh uma var nova, ele deixa incializar ela e mudar o valor de outras variaveis ja declaradas
		System.out.println("a4 " + a4 + " a5 " + a5 + " a7 " + a7);
		
		
		//OPERADORES ARITMETICOS
		//+, -, *, /, %
		
		int b = 2;
		int c = 7;
		
		int d;
		//soma
		d= b+c; //repare que voce pode usar a mesma variavel mais de uma vez; entretanto, o valor que ela guardava antes se perder'a
		System.out.println("b+c=" + d);
		//subtracao
		d= b-c;
		System.out.println("b-c=" + d);
		//multiplicacao
		d= b*c;
		System.out.println("b*c=" + d);
		//divisao
		d= c/b;
		System.out.println("b/c=" + d);
		//modulo: eh o RESTO DA DIVISAO
		d = c%b;
		System.out.println("b%c=" + d);
		
		//como estamos trabalhando com int, o resultado sempre sera inteiro; se
		//quisermos uma divisao fracionaria, precisamos converter pra float ou double
		double e = (double) c/b;
		System.out.println("(double) c/b=" + e);
		float myfloat = (float) c/b;
		System.out.println("(float) c/b=" + myfloat);
		
		double g = (double) c%b;
		System.out.println("(double) c%b=" + g);
		
		char char1 = (char) 5-2; //ok
		//char char1 = (char) 2-5; //nao compila; char nao aceita numero com sinal
		
		//COMPARACAO
		//== (IGUAL), != (DIFERENTE)
		boolean boolean1 = (5 == 2);
		System.out.println("boolean1=" + boolean1);
		boolean boolean2 = isEqual(b, c);
		System.out.println("b=" + b + " c=" + c + " boolean2=" + boolean2);
		boolean boolean3 = isEqual(3, 3);
		System.out.println("boolean3=" + boolean3);
		
		boolean boolean4 = isEqual((float)3.0,  3);
		System.out.println("boolean4=" + boolean4); //true
		
		int h = 4;
		//voce pode comparar uma variavel com um valor ou com outra variavel
		boolean boolean5 = (h==4);
		boolean boolean6 = (h!=4);
		System.out.println("h=" + h + " boolean5=" + boolean5 + " boolean6=" + boolean6); 
		
		//COMPONDO OPERADORES DE ATRIBUICAO E ARITMETICOS
		//y = y+x; x nao altera
		int y =8, x=2;
		System.out.println("1. y before: " + y + "; x before: " + x); 
		y+=x; //eh o mesmo que y = y + x
		System.out.println("1. y after: " + y + "; x after: " + x); 
		
		//y = y-x; x nao altera
		y = 8; x=2;
		System.out.println("2. y before: " + y + "; x before: " + x); 
		y-=x; //eh o mesmo que y = y - x
		System.out.println("2. y after: " + y + "; x after: " + x);  
		
		//y = y*x; x nao altera
		y = 8; x=2;
		System.out.println("3. y before: " + y + "; x before: " + x); 
		y*=x; //eh o mesmo que y = y * x
		System.out.println("3. y after: " + y + "; x after: " + x);  
		
		
		//y = y/x; x nao altera
		y = 8; x=2;
		System.out.println("4. y before: " + y + "; x before: " + x); 
		y/=x; //eh o mesmo que y = y / x
		System.out.println("4. y after: " + y + "; x after: " + x);  
		
		//y = y%x; x nao altera
		y = 8; x=2;
		System.out.println("5.y before: " + y + "; x before: " + x); 
		y%=x; //eh o mesmo que y = y % x
		System.out.println("5. y after: " + y + "; x after: " + x);  
		
		//z++ <=> z=z+1
		int z = 10;
		z++; //soma um ao z
		System.out.println("z: " + z);
		int w = 5;
		z--; //soma um ao z
		System.out.println("w: " + w);

		int m=7, n=3, p;
		System.out.println("m before: " + m);
		//equivale a essas 2 instrucoes nessa exata sequencia:
		//p = m; (p=7)
		//m++;   (m=8)
		p = m++; 
		
		System.out.println("m after: " + m + "  p=m++: " + p);
		//equivale a essas 2 instrucoes nessa exata sequencia:
		//n++;   (n=4)
		//p=n;   (p=4)
		System.out.println("n before: " + n);
		p = ++n; //como se fosse p= (++n);
		
		System.out.println("n after: " + n + "  p=++n: " + p);
		
		//OPERADORES DE COMPARACAO
		//>, <, >=, <=
		//retornam true ou false
		int m1=4, m2=5, m3=5;
		System.out.println("m1>m2? " + (m1>m2));
		System.out.println("m2>=m3? " + (m2>=m3));
		System.out.println("m3<=m3? " + (m3<=m3));
		
		//OPERADORES LOGICOS
		//&& (and), || (or), ! (not), & (and), | (or)
		//retornam true ou false
		
		
		//TABELA VERDADE DOS OPERADORES
		//AND - todos os operandos precisam ser TRUE; se um for false, da false
		System.out.println("true && true: " + (true && true));
		System.out.println("false && true: " + (false && true));
		System.out.println("true && false: " + (true && false));
		System.out.println("false && false: " + (false  && false));
		System.out.println("true && true && true && true && false: " + (true && true && true && true && false));
		System.out.println("true && true && true && true && true: " + (true && true && true && true && true));
		
		//OR - pelo menos um operando precisa ser true; so da false quando todos sao false
		System.out.println("false || false: " + (false || false));
		System.out.println("false || true: " + (false || true));
		System.out.println("true || false: " + (true || false));
		System.out.println("true || true: " + (true || true));
		System.out.println("true || false || false || false || false: " + (true || false || false || false || false));
		System.out.println("false || false || false || false || false: " + (false || false || false || false || false));
		
		
		
		
	}
	
	public static boolean isEqual(int a, int b){
		return a==b;
	}
	
	//dois metodos com o mesmo nome e mesmo tipo de retorno, mas com lista de parametros diferente: isso se chama sobrecarga de metodos
	public static boolean isEqual(float a, float b){
		return a==b;
	}

}
