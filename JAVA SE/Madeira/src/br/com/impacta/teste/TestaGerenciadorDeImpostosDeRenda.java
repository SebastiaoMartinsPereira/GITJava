package br.com.impacta.teste;

import br.com.impacta.modelos.ContaCorrente;
import br.com.impacta.modelos.GerenciadorDeImpostosDeRenda;
import br.com.impacta.modelos.SeguroDeVida;

public class TestaGerenciadorDeImpostosDeRenda {

	public static void main(String[] args) {
		
		GerenciadorDeImpostosDeRenda gerenciador = new GerenciadorDeImpostosDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);

		ContaCorrente cc = new ContaCorrente(1234,"Sebastiao",123.,1234.);
		cc.deposita(1000.);
	    gerenciador.adiciona(cc);
	    
	    System.out.println(gerenciador.getTotal());
	}

}
