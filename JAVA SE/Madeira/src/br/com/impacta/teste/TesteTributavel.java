package br.com.impacta.teste;

import br.com.impacta.modelos.ContaCorrente;
import br.com.impacta.modelos.interfaces.Tributavel;

public class TesteTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(12345,"Sebastiao",1234.,12345.) {
		};
		cc.deposita(100.);
		System.out.println(cc.calculaTributos());
		
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		//A pesar de referenciar a classe ContaCorrente o método getSaldo pertence a 
		//classe conta e a interface tributavel não é uyma conta.
		//t.getSaldo();
		
		System.out.printf("O saldo é : %.2f",cc.getSaldo());

	}

}
