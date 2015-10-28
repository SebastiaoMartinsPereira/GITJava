package br.com.impacta.modelos.calculaveis;

import br.com.impacta.modelos.interfaces.AreaCalculavel;

public class Quadrado implements AreaCalculavel{

	private int lado;

	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	public double calculaArea() {
		return this.lado*this.lado;
	}
		
}
