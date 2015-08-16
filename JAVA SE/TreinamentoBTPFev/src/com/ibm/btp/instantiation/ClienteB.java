package com.ibm.btp.instantiation;

public class ClienteB extends ClienteC {

	
	private String name;
	
	private String cpf;
	
	private double saldo;
	
	private int idade;
	
	private String telefone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	public ClienteB(){
		
	}

	@Override
	public String toString() {
		return "ClienteB [name=" + name + ", cpf=" + cpf + ", saldo=" + saldo
				+ ", idade=" + idade + ", telefone=" + telefone + "]";
	}
	
	
	
	
}
