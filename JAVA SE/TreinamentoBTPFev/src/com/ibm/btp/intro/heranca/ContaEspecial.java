package com.ibm.btp.intro.heranca;

import com.ibm.btp.atividade.Cliente;

public class ContaEspecial extends Conta {

	private double limite;
	
	
	public ContaEspecial(double saldo, int numero, Cliente cliente,double limite){
		super(saldo, numero, cliente);
		this.setLimite(limite);
	}
	
	public ContaEspecial(){
		
	}
	
	
	@Override
	public double consultaSaldo(){
		return getSaldo() + getLimite();
	}
	
	
	public double consultarLimite(){
		return this.getLimite();
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
