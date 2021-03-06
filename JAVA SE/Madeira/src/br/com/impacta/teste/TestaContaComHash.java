package br.com.impacta.teste;

import java.util.HashSet;
import java.util.Set;

import br.com.impacta.modelos.Conta;
import br.com.impacta.modelos.ContaCorrente;

public class TestaContaComHash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  
		Conta c1 = new ContaCorrente(1,"Sebastiao",123.,12345.);
		c1.deposita(10000.);
		Conta c2 = new ContaCorrente(2,"Jose",1234.,123465.);
		c2.deposita(3000.);
		Conta c3 = new ContaCorrente(3,"Rodrigo",1234.,123465.);
		c2.deposita(3000.);
		Conta c4 = new ContaCorrente(4,"Ancelmo",1234.,123465.);
		c2.deposita(3000.);
		Conta c5 = new ContaCorrente(5,"Adalberto",1234.,123465.);
		c2.deposita(3000.);
		Conta c6 = new ContaCorrente(6,"Marinho",1234.,123465.);
		c2.deposita(3000.);
		Conta c7 = new ContaCorrente(7,"juliano",1234.,123465.);
		c2.deposita(3000.);
		// cria o mapa
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Set<Conta> mapaDeContas = new HashSet();
		
		// adiciona duas chaves e seus valores
		mapaDeContas.add(c1);
		mapaDeContas.add(c2);
		mapaDeContas.add(c3);
		mapaDeContas.add(c4);
		mapaDeContas.add(c5);
		mapaDeContas.add(c6);
		mapaDeContas.add(c7);
		
		// qual a conta do diretor?
		for (Conta conta : mapaDeContas) {
			System.out.println(conta);
		}
		
	  }	
}
