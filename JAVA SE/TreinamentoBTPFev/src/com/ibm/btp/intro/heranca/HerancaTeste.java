package com.ibm.btp.intro.heranca;

import javax.sound.sampled.Control;

import com.ibm.btp.atividade.Cliente;

public class HerancaTeste {

	public static void main(String[] args) {
		
		Cliente cli = new Cliente();
		Conta conta = new Conta();
		ContaEspecial cspecial= new ContaEspecial(1000,123,cli,300);
	
		System.out.println("Especial "+cspecial.consultaSaldo());
		System.out.println("Conta  "+cli.toString());
		

	}

}
