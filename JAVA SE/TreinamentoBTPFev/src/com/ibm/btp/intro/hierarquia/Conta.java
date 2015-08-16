package com.ibm.btp.intro.hierarquia;

import com.ibm.btp.atividade.Cliente;

public abstract class Conta {
	
	private double saldo;
	private int numero;
	private Cliente titular;
	
	public Conta(double saldo, int numero, Cliente titular) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.titular = titular;
	}

	public Conta(){
		
	}
	
	public abstract double consultaSaldo();
	
	public abstract boolean depositar(double valor);
	
	public abstract boolean sacar(double valor);
	
	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
//	

}
