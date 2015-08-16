package com.ibm.btp.intro.heranca;

import com.ibm.btp.atividade.Cliente;

public  class Conta {
	
	private double saldo;
	private int numero;
	private Cliente titular;

	public Conta() {

	}

	public Conta(double saldo, int numero, Cliente cliente) {
		super();
		this.setSaldo(saldo);
		this.setNumero(numero);
		this.setTitular(cliente);
	}

	public boolean sacar(double valor) {
		if (this.saldo > valor) {
			this.setSaldo(this.saldo - valor);
			return true;
		} else {

			System.out.println("Não foi possível realizar o saque.");
			return false;
		}
	}

	public double consultaSaldo() {

		return this.getSaldo();

	}

	public boolean depositar(double valor) {

		this.setSaldo(this.saldo + valor);
		return true;
	}

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

}
