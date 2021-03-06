package br.com.impacta.modelos.calculaveis;

import br.com.impacta.modelos.interfaces.AreaCalculavel;

public class Circulo implements AreaCalculavel{

	private double raio;
	private double PI = Math.PI;
	
	public Circulo(double raio){
		this.raio = raio;
	}

	public double calculaArea() {
		 
		return  PI * (Math.pow(raio, 2) ) ;
	}
}


