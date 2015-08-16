package com.ibm.btp.intro.hierarquia;

import com.ibm.btp.atividade.Cliente;

public class ContaSpecial extends Conta{
	
	private int limite;

    public ContaSpecial(double saldo, int numero, Cliente titular, int limite) {
		super(saldo, numero, titular);
		this.setLimite(limite);
	}
	
	@Override
	public double consultaSaldo() {
		
		return super.getSaldo();
	}

	@Override
	public boolean depositar(double valor) {
		if (valor<0){
			return false;
		}else{
			super.setSaldo(super.getSaldo()+valor);
			return true;
		}
	}

	@Override
	public boolean sacar(double valor) {
		if(valor <=  super.getSaldo()+this.limite){
			super.setSaldo(super.getSaldo()-valor);
			return true;
		}else{
			return false;
		}
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	
	

}
