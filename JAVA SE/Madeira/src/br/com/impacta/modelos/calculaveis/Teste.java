package br.com.impacta.modelos.calculaveis;

import java.awt.Rectangle;

import br.com.impacta.modelos.interfaces.AreaCalculavel;

public class Teste {
	public static void main (String[] args){
		
		AreaCalculavel a = (AreaCalculavel) new Rectangle(3,2);
		System.out.println(a.calculaArea());
	}
}
