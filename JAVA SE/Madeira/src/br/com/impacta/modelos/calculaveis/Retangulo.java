package br.com.impacta.modelos.calculaveis;

import br.com.impacta.modelos.interfaces.AreaCalculavel;

public class Retangulo implements AreaCalculavel{

	private int largura;
	private int altura;
	
	public Retangulo(int largura,int altura){
		
		this.largura = largura;
		this.altura = altura;
	}
	
	
	public double calculaArea() {
		// TODO Auto-generated method stub
		return this.largura * this.altura;
	}
	
}
