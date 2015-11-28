package br.com.impacta.modelos.lists;

import java.util.HashMap;
import java.util.Map;

import br.com.impacta.modelos.Conta;
import br.com.impacta.modelos.ContaCorrente;


      public class TestaMapa {
			  
	  public static void main(String[] args) {
  
		Conta c1 = new ContaCorrente(1,"Eu",123.,12345.);
		c1.deposita(10000.);
		
		Conta c2 = new ContaCorrente(1,"Eu",1234.,123465.);
		c2.deposita(3000.);
		
		// cria o mapa
		Map<String,Conta> mapaDeContas = new HashMap<String, Conta>();
		
		// adiciona duas chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		// qual a conta do diretor?
		Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
	  }
	}
