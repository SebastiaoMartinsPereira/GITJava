package br.com.impacta.modelos;

import br.com.impacta.modelos.interfaces.Tributavel;

public class GerenciadorDeImpostosDeRenda {
	private  double total;
	
	public void adiciona (Tributavel t){
		System.out.println("Adicionando tributavel : " + t);
		this.total += t.calculaTributos();
	}
	
	public double getTotal(){
		return this.total;
		
	}
		
	
}


