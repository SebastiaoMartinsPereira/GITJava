package com.ibm.btp.intro.hierarquia;

import com.ibm.btp.atividade.Cliente;

public class ContaComun extends Conta {

	
	public ContaComun(double saldo,int numero,Cliente titular){
		super(saldo, numero, titular);
		
	}
	
	@Override
	public double consultaSaldo() {
		return super.getSaldo();
	}

	@Override
	public boolean sacar(double valor) {
		
		if (valor < super.getSaldo())
		{
			super.setSaldo(super.getSaldo()-valor);
			return true;
		}else{
			return false;
		}
		
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
    
	
}
